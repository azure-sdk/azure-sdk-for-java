// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.monitor.query.logs;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ServiceResponseException;
import com.azure.core.http.HttpHeaderName;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.azure.monitor.query.logs.implementation.LogsQueryHelper;
import com.azure.monitor.query.logs.implementation.MonitorQueryLogsAsyncClient;
import com.azure.monitor.query.logs.implementation.models.BatchQueryRequest;
import com.azure.monitor.query.logs.implementation.models.BatchRequest;
import com.azure.monitor.query.logs.implementation.models.BatchResponse;
import com.azure.monitor.query.logs.implementation.models.QueryBody;
import com.azure.monitor.query.logs.implementation.models.QueryResults;
import com.azure.monitor.query.logs.models.LogsBatchQuery;
import com.azure.monitor.query.logs.models.LogsBatchQueryResultCollection;
import com.azure.monitor.query.logs.models.LogsQueryOptions;
import com.azure.monitor.query.logs.models.LogsQueryResult;
import com.azure.monitor.query.logs.models.LogsQueryResultStatus;
import com.azure.monitor.query.logs.models.LogsQueryTimeInterval;
import reactor.core.publisher.Mono;
import reactor.core.publisher.SynchronousSink;

import java.time.Duration;
import java.util.List;

import static com.azure.core.util.FluxUtil.withContext;
import static com.azure.monitor.query.logs.implementation.LogsQueryHelper.AZURE_RESPONSE_TIMEOUT;
import static com.azure.monitor.query.logs.implementation.LogsQueryHelper.CLIENT_TIMEOUT_BUFFER;
import static com.azure.monitor.query.logs.implementation.LogsQueryHelper.getAllWorkspaces;

/**
 * <p>Provides an asynchronous service client for querying logs in the Azure Monitor Service.</p>
 *
 * <p>The LogsQueryClient is an asynchronous client that provides methods to execute Kusto queries against
 * Azure Monitor logs. It provides methods to query logs in a specific workspace, execute a batch of queries, and
 * query logs for a specific Azure resource.</p>
 *
 * <h2>Getting Started</h2>
 *
 * <p>Authenticating and building instances of this client are handled by {@link LogsQueryClientBuilder}.
 * This sample shows how to authenticate and build a LogQueryAsyncClient instance using LogQueryClientBuilder.</p>
 *
 * <!-- src_embed com.azure.monitor.query.LogsQueryAsyncClient.instantiation -->
 * <pre>
 * LogsQueryAsyncClient logsQueryAsyncClient = new LogsQueryClientBuilder&#40;&#41;
 *         .credential&#40;tokenCredential&#41;
 *         .buildAsyncClient&#40;&#41;;
 * </pre>
 * <!-- end com.azure.monitor.query.LogsQueryAsyncClient.instantiation -->
 *
 * <p>For more information on building and authenticating, see the {@link LogsQueryClientBuilder} documentation.</p>
 *
 * <h3>Client Usage</h3>
 *
 * <p>
 *     For more information on how to use this client, see the following method documentation:
 * </p>
 *
 * <ul>
 *     <li>
 *         {@link LogsQueryAsyncClient#queryWorkspace(String, String, LogsQueryTimeInterval) queryWorkspace(String, String, LogsQueryTimeInterval)} - Query logs from a workspace.
 *     </li>
 *     <li>
 *         {@link LogsQueryAsyncClient#queryWorkspaceWithResponse(String, String, LogsQueryTimeInterval, LogsQueryOptions) queryWorkspaceWithResponse(String, String, LogsQueryTimeInterval, LogsQueryOptions)} - Query logs from a workspace using query options with service response returned.
 *     </li>
 *     <li>
 *         {@link LogsQueryAsyncClient#queryBatch(LogsBatchQuery) queryBatch(LogsBatchQuery)} - Execute a batch of logs queries.
 *     </li>
 *     <li>
 *         {@link LogsQueryAsyncClient#queryBatchWithResponse(LogsBatchQuery) queryBatchWithResponse(LogsBatchQuery)} - Execute a batch of logs queries with service response returned.
 *     </li>
 *     <li>
 *         {@link LogsQueryAsyncClient#queryResource(String, String, LogsQueryTimeInterval) queryResource(String, String, LogsQueryTimeInterval)} - Query logs for an Azure resource.
 *     </li>
 *     <li>
 *         {@link LogsQueryAsyncClient#queryResourceWithResponse(String, String, LogsQueryTimeInterval, LogsQueryOptions) queryResourceWithResponse(String, String, LogsQueryTimeInterval, LogsQueryOptions)} - Query logs for an Azure resource using query options with service response returned.
 *     </li>
 * </ul>
 *
 * @see com.azure.monitor.query
 * @see LogsQueryClientBuilder
 */
@ServiceClient(builder = LogsQueryClientBuilder.class, isAsync = true)
public final class LogsQueryAsyncClient {

    private final MonitorQueryLogsAsyncClient innerClient;

    /**
     * Constructor that has the inner generated client to make the service call.
     * @param innerClient The inner generated client.
     */
    LogsQueryAsyncClient(MonitorQueryLogsAsyncClient innerClient) {
        this.innerClient = innerClient;
    }

    /**
     * Returns all the Azure Monitor logs matching the given query in the specified workspaceId.
     *
     * <p><strong>Query logs from the last 24 hours</strong></p>
     * <!-- src_embed com.azure.monitor.query.LogsQueryAsyncClient.query#String-String-QueryTimeInterval -->
     * <pre>
     * Mono&lt;LogsQueryResult&gt; queryResult = logsQueryAsyncClient.queryWorkspace&#40;&quot;&#123;workspace-id&#125;&quot;, &quot;&#123;kusto-query&#125;&quot;,
     *         LogsQueryTimeInterval.LAST_DAY&#41;;
     * queryResult.subscribe&#40;result -&gt; &#123;
     *     for &#40;LogsTableRow row : result.getTable&#40;&#41;.getRows&#40;&#41;&#41; &#123;
     *         System.out.println&#40;row.getRow&#40;&#41;
     *                 .stream&#40;&#41;
     *                 .map&#40;LogsTableCell::getValueAsString&#41;
     *                 .collect&#40;Collectors.joining&#40;&quot;,&quot;&#41;&#41;&#41;;
     *     &#125;
     * &#125;&#41;;
     * </pre>
     * <!-- end com.azure.monitor.query.LogsQueryAsyncClient.query#String-String-QueryTimeInterval -->
     *
     * @param workspaceId The workspaceId where the query should be executed.
     * @param query The Kusto query to fetch the logs.
     * @param timeInterval The time period for which the logs should be looked up.
     * @return The logs matching the query.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LogsQueryResult> queryWorkspace(String workspaceId, String query, LogsQueryTimeInterval timeInterval) {
        return queryWorkspaceWithResponse(workspaceId, query, timeInterval, new LogsQueryOptions())
            .map(Response::getValue);
    }

    /**
     * Returns all the Azure Monitor logs matching the given query in the specified workspaceId.
     *
     * @param workspaceId The workspaceId where the query should be executed.
     * @param query The Kusto query to fetch the logs.
     * @param timeInterval The time period for which the logs should be looked up.
     * @param type The type the result of this query should be mapped to.
     * @param <T> The type the result of this query should be mapped to.
     * @return The logs matching the query as a list of objects of type T.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public <T> Mono<List<T>> queryWorkspace(String workspaceId, String query, LogsQueryTimeInterval timeInterval,
        Class<T> type) {
        return queryWorkspace(workspaceId, query, timeInterval)
            .map(result -> LogsQueryHelper.toObject(result.getTable(), type));
    }

    /**
     * Returns all the Azure Monitor logs matching the given query in the specified workspaceId.
     *
     * @param workspaceId The workspaceId where the query should be executed.
     * @param query The Kusto query to fetch the logs.
     * @param timeInterval The time period for which the logs should be looked up.
     * @param type The type the result of this query should be mapped to.
     * @param <T> The type the result of this query should be mapped to.
     * @param options The log query options to configure server timeout, set additional workspaces or enable
     * statistics and rendering information in response.
     * @return The logs matching the query as a list of objects of type T.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public <T> Mono<List<T>> queryWorkspace(String workspaceId, String query, LogsQueryTimeInterval timeInterval,
        Class<T> type, LogsQueryOptions options) {
        return queryWorkspaceWithResponse(workspaceId, query, timeInterval, options, Context.NONE)
            .map(response -> LogsQueryHelper.toObject(response.getValue().getTable(), type));
    }

    /**
     * Returns all the Azure Monitor logs matching the given query in the specified workspaceId.
     *
     * <p><strong>Query logs from the last 7 days and set the service timeout to 2 minutes</strong></p>
     *
     * <!-- src_embed com.azure.monitor.query.LogsQueryAsyncClient.queryWithResponse#String-String-QueryTimeInterval-LogsQueryOptions -->
     * <pre>
     * Mono&lt;Response&lt;LogsQueryResult&gt;&gt; queryResult = logsQueryAsyncClient.queryWorkspaceWithResponse&#40;&quot;&#123;workspace-id&#125;&quot;,
     *         &quot;&#123;kusto-query&#125;&quot;,
     *         LogsQueryTimeInterval.LAST_7_DAYS,
     *         new LogsQueryOptions&#40;&#41;.setServerTimeout&#40;Duration.ofMinutes&#40;2&#41;&#41;&#41;;
     *
     * queryResult.subscribe&#40;result -&gt; &#123;
     *     for &#40;LogsTableRow row : result.getValue&#40;&#41;.getTable&#40;&#41;.getRows&#40;&#41;&#41; &#123;
     *         System.out.println&#40;row.getRow&#40;&#41;
     *                 .stream&#40;&#41;
     *                 .map&#40;LogsTableCell::getValueAsString&#41;
     *                 .collect&#40;Collectors.joining&#40;&quot;,&quot;&#41;&#41;&#41;;
     *     &#125;
     * &#125;&#41;;
     * </pre>
     * <!-- end com.azure.monitor.query.LogsQueryAsyncClient.queryWithResponse#String-String-QueryTimeInterval-LogsQueryOptions -->
     *
     * @param workspaceId The workspaceId where the query should be executed.
     * @param query The Kusto query to fetch the logs.
     * @param timeInterval The time period for which the logs should be looked up.
     * @param options The log query options to configure server timeout, set additional workspaces or enable
     * statistics and rendering information in response.
     * @return The logs matching the query.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<LogsQueryResult>> queryWorkspaceWithResponse(String workspaceId, String query,
        LogsQueryTimeInterval timeInterval, LogsQueryOptions options) {
        return withContext(context -> queryWorkspaceWithResponse(workspaceId, query, timeInterval, options, context));
    }

    /**
     * Returns all the Azure Monitor logs matching the given query in the specified workspaceId.
     *
     * @param workspaceId The workspaceId where the query should be executed.
     * @param query The Kusto query to fetch the logs.
     * @param timeInterval The time period for which the logs should be looked up.
     * @param type The type the result of this query should be mapped to.
     * @param <T> The type the result of this query should be mapped to.
     * @param options The log query options to configure server timeout, set additional workspaces or enable
     * statistics and rendering information in response.
     * @return The logs matching the query including the HTTP response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public <T> Mono<Response<List<T>>> queryWorkspaceWithResponse(String workspaceId, String query,
        LogsQueryTimeInterval timeInterval, Class<T> type, LogsQueryOptions options) {
        return queryWorkspaceWithResponse(workspaceId, query, timeInterval, options)
            .map(response -> new SimpleResponse<>(response.getRequest(), response.getStatusCode(),
                response.getHeaders(), LogsQueryHelper.toObject(response.getValue().getTable(), type)));
    }

    /**
     * Returns all the Azure Monitor logs matching the given batch of queries.
     *
     * <p><strong>Execute a batch of logs queries</strong></p>
     *
     * <!-- src_embed com.azure.monitor.query.LogsQueryAsyncClient.queryBatch#LogsBatchQuery -->
     * <pre>
     * LogsBatchQuery batchQuery = new LogsBatchQuery&#40;&#41;;
     * String queryId1 = batchQuery.addWorkspaceQuery&#40;&quot;&#123;workspace-id-1&#125;&quot;, &quot;&#123;kusto-query-1&#125;&quot;, LogsQueryTimeInterval.LAST_DAY&#41;;
     * String queryId2 = batchQuery.addWorkspaceQuery&#40;&quot;&#123;workspace-id-2&#125;&quot;, &quot;&#123;kusto-query-2&#125;&quot;,
     *         LogsQueryTimeInterval.LAST_7_DAYS, new LogsQueryOptions&#40;&#41;.setServerTimeout&#40;Duration.ofMinutes&#40;2&#41;&#41;&#41;;
     *
     * Mono&lt;LogsBatchQueryResultCollection&gt; batchQueryResponse = logsQueryAsyncClient.queryBatch&#40;batchQuery&#41;;
     *
     * batchQueryResponse.subscribe&#40;result -&gt; &#123;
     *     for &#40;LogsBatchQueryResult queryResult : result.getBatchResults&#40;&#41;&#41; &#123;
     *         System.out.println&#40;&quot;Logs query result for query id &quot; + queryResult.getId&#40;&#41;&#41;;
     *         for &#40;LogsTableRow row : queryResult.getTable&#40;&#41;.getRows&#40;&#41;&#41; &#123;
     *             System.out.println&#40;row.getRow&#40;&#41;
     *                     .stream&#40;&#41;
     *                     .map&#40;LogsTableCell::getValueAsString&#41;
     *                     .collect&#40;Collectors.joining&#40;&quot;,&quot;&#41;&#41;&#41;;
     *         &#125;
     *     &#125;
     * &#125;&#41;;
     * </pre>
     * <!-- end com.azure.monitor.query.LogsQueryAsyncClient.queryBatch#LogsBatchQuery -->
     *
     * @param logsBatchQuery {@link LogsBatchQuery} containing a batch of queries.
     * @return A collection of query results corresponding to the input batch of queries.@return
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LogsBatchQueryResultCollection> queryBatch(LogsBatchQuery logsBatchQuery) {
        return queryBatchWithResponse(logsBatchQuery).map(Response::getValue);
    }

    /**
     * Returns all the Azure Monitor logs matching the given batch of queries.
     * @param logsBatchQuery {@link LogsBatchQuery} containing a batch of queries.
     * @return A collection of query results corresponding to the input batch of queries.@return
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<LogsBatchQueryResultCollection>> queryBatchWithResponse(LogsBatchQuery logsBatchQuery) {
        return queryBatchWithResponse(logsBatchQuery, Context.NONE);
    }

    /**
     * Returns all the Azure Monitor logs matching the given query for an Azure resource.
     *
     * <p><strong>Query logs from the last 24 hours</strong></p>
     * <!-- src_embed com.azure.monitor.query.LogsQueryAsyncClient.queryResource#String-String-QueryTimeInterval -->
     * <pre>
     * Mono&lt;LogsQueryResult&gt; queryResult = logsQueryAsyncClient.queryResource&#40;&quot;&#123;resource-id&#125;&quot;, &quot;&#123;kusto-query&#125;&quot;,
     *     LogsQueryTimeInterval.LAST_DAY&#41;;
     * queryResult.subscribe&#40;result -&gt; &#123;
     *     for &#40;LogsTableRow row : result.getTable&#40;&#41;.getRows&#40;&#41;&#41; &#123;
     *         System.out.println&#40;row.getRow&#40;&#41;
     *             .stream&#40;&#41;
     *             .map&#40;LogsTableCell::getValueAsString&#41;
     *             .collect&#40;Collectors.joining&#40;&quot;,&quot;&#41;&#41;&#41;;
     *     &#125;
     * &#125;&#41;;
     * </pre>
     * <!-- end com.azure.monitor.query.LogsQueryAsyncClient.queryResource#String-String-QueryTimeInterval -->
     *
     * @param resourceId The resourceId where the query should be executed.
     * @param query The Kusto query to fetch the logs.
     * @param timeInterval The time period for which the logs should be looked up.
     * @return The logs matching the query.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LogsQueryResult> queryResource(String resourceId, String query, LogsQueryTimeInterval timeInterval) {
        return queryResourceWithResponse(resourceId, query, timeInterval, new LogsQueryOptions())
            .map(Response::getValue);
    }

    /**
     * Returns all the Azure Monitor logs matching the given query for an Azure resource.
     *
     * @param resourceId The resourceId where the query should be executed.
     * @param query The Kusto query to fetch the logs.
     * @param timeInterval The time period for which the logs should be looked up.
     * @param type The type the result of this query should be mapped to.
     * @param <T> The type the result of this query should be mapped to.
     * @return The logs matching the query as a list of objects of type T.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public <T> Mono<List<T>> queryResource(String resourceId, String query, LogsQueryTimeInterval timeInterval,
        Class<T> type) {
        return queryResource(resourceId, query, timeInterval)
            .map(result -> LogsQueryHelper.toObject(result.getTable(), type));
    }

    /**
     * Returns all the Azure Monitor logs matching the given query for an Azure resource.
     *
     * @param resourceId The resourceId where the query should be executed.
     * @param query The Kusto query to fetch the logs.
     * @param timeInterval The time period for which the logs should be looked up.
     * @param type The type the result of this query should be mapped to.
     * @param <T> The type the result of this query should be mapped to.
     * @param options The log query options to configure server timeout, set additional workspaces or enable
     * statistics and rendering information in response.
     * @return The logs matching the query as a list of objects of type T.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public <T> Mono<List<T>> queryResource(String resourceId, String query, LogsQueryTimeInterval timeInterval,
        Class<T> type, LogsQueryOptions options) {
        return queryResourceWithResponse(resourceId, query, timeInterval, options, Context.NONE)
            .map(response -> LogsQueryHelper.toObject(response.getValue().getTable(), type));
    }

    /**
     * Returns all the Azure Monitor logs matching the given query for an Azure resource.
     *
     * <p><strong>Query logs from the last 7 days and set the service timeout to 2 minutes</strong></p>
     *
     * <!-- src_embed com.azure.monitor.query.LogsQueryAsyncClient.queryResourceWithResponse#String-String-QueryTimeInterval-LogsQueryOptions -->
     * <pre>
     * Mono&lt;Response&lt;LogsQueryResult&gt;&gt; queryResult = logsQueryAsyncClient.queryResourceWithResponse&#40;&quot;&#123;resource-id&#125;&quot;,
     *     &quot;&#123;kusto-query&#125;&quot;,
     *     LogsQueryTimeInterval.LAST_7_DAYS,
     *     new LogsQueryOptions&#40;&#41;.setServerTimeout&#40;Duration.ofMinutes&#40;2&#41;&#41;&#41;;
     *
     * queryResult.subscribe&#40;result -&gt; &#123;
     *     for &#40;LogsTableRow row : result.getValue&#40;&#41;.getTable&#40;&#41;.getRows&#40;&#41;&#41; &#123;
     *         System.out.println&#40;row.getRow&#40;&#41;
     *             .stream&#40;&#41;
     *             .map&#40;LogsTableCell::getValueAsString&#41;
     *             .collect&#40;Collectors.joining&#40;&quot;,&quot;&#41;&#41;&#41;;
     *     &#125;
     * &#125;&#41;;
     * </pre>
     * <!-- end com.azure.monitor.query.LogsQueryAsyncClient.queryResourceWithResponse#String-String-QueryTimeInterval-LogsQueryOptions -->
     *
     * @param resourceId The resourceId where the query should be executed.
     * @param query The Kusto query to fetch the logs.
     * @param timeInterval The time period for which the logs should be looked up.
     * @param options The log query options to configure server timeout, set additional workspaces or enable
     * statistics and rendering information in response.
     * @return The logs matching the query.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<LogsQueryResult>> queryResourceWithResponse(String resourceId, String query,
        LogsQueryTimeInterval timeInterval, LogsQueryOptions options) {
        return withContext(context -> queryResourceWithResponse(resourceId, query, timeInterval, options, context));
    }

    /**
     * Returns all the Azure Monitor logs matching the given query for an Azure resource.
     *
     * @param resourceId The resourceId where the query should be executed.
     * @param query The Kusto query to fetch the logs.
     * @param timeInterval The time period for which the logs should be looked up.
     * @param type The type the result of this query should be mapped to.
     * @param <T> The type the result of this query should be mapped to.
     * @param options The log query options to configure server timeout, set additional workspaces or enable
     * statistics and rendering information in response.
     * @return The logs matching the query including the HTTP response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public <T> Mono<Response<List<T>>> queryResourceWithResponse(String resourceId, String query,
        LogsQueryTimeInterval timeInterval, Class<T> type, LogsQueryOptions options) {
        return queryResourceWithResponse(resourceId, query, timeInterval, options)
            .map(response -> new SimpleResponse<>(response.getRequest(), response.getStatusCode(),
                response.getHeaders(), LogsQueryHelper.toObject(response.getValue().getTable(), type)));
    }

    Mono<Response<LogsBatchQueryResultCollection>> queryBatchWithResponse(LogsBatchQuery logsBatchQuery,
        Context context) {
        List<BatchQueryRequest> requests = LogsQueryHelper.getBatchQueries(logsBatchQuery);
        Duration maxServerTimeout = LogsQueryHelper.getMaxServerTimeout(logsBatchQuery);
        if (maxServerTimeout != null) {
            context = context.addData(AZURE_RESPONSE_TIMEOUT, maxServerTimeout.plusSeconds(CLIENT_TIMEOUT_BUFFER));
        }

        BatchRequest batchRequest = new BatchRequest(requests);

        return innerClient
            .batchWithResponse(BinaryData.fromObject(batchRequest), new RequestOptions().setContext(context))
            .map(response -> new SimpleResponse<>(response.getRequest(), response.getStatusCode(),
                response.getHeaders(), response.getValue().toObject(BatchResponse.class)))
            .map(LogsQueryHelper::convertToLogQueryBatchResult);
    }

    private Context updateContext(Duration serverTimeout, Context context) {
        if (serverTimeout != null) {
            return context.addData(AZURE_RESPONSE_TIMEOUT, serverTimeout.plusSeconds(CLIENT_TIMEOUT_BUFFER));
        }
        return context;
    }

    Mono<Response<LogsQueryResult>> queryWorkspaceWithResponse(String workspaceId, String query,
        LogsQueryTimeInterval timeInterval, LogsQueryOptions options, Context context) {
        String preferHeader = LogsQueryHelper.buildPreferHeaderString(options);
        context = updateContext(options.getServerTimeout(), context);

        QueryBody queryBody = new QueryBody(query);
        if (timeInterval != null) {
            queryBody.setTimespan(LogsQueryHelper.toIso8601Format(timeInterval));
        }
        queryBody.setWorkspaces(getAllWorkspaces(options));

        RequestOptions requestOptions
            = new RequestOptions().setContext(context).setHeader(HttpHeaderName.PREFER, preferHeader);

        return innerClient.executeWithResponse(workspaceId, BinaryData.fromObject(queryBody), requestOptions)
            .map(response -> new SimpleResponse<>(response.getRequest(), response.getStatusCode(),
                response.getHeaders(), response.getValue().toObject(QueryResults.class)))
            .map(LogsQueryHelper::convertToLogQueryResult)
            .handle((Response<LogsQueryResult> response, SynchronousSink<Response<LogsQueryResult>> sink) -> {
                if (response.getValue().getQueryResultStatus() == LogsQueryResultStatus.PARTIAL_FAILURE
                    && !options.isAllowPartialErrors()) {

                    sink.error(new ServiceResponseException("Query execution returned partial errors. To "
                        + "disable exceptions on partial errors, set setAllowPartialErrors in "
                        + "LogsQueryOptions to true."));
                } else {
                    sink.next(response);
                }
            });
    }

    Mono<Response<LogsQueryResult>> queryResourceWithResponse(String resourceId, String query,
        LogsQueryTimeInterval timeInterval, LogsQueryOptions options, Context context) {
        if (resourceId != null && resourceId.startsWith("/")) {
            resourceId = resourceId.substring(1);
        }
        String preferHeader = LogsQueryHelper.buildPreferHeaderString(options);
        context = updateContext(options.getServerTimeout(), context);
        QueryBody queryBody = new QueryBody(query);
        if (timeInterval != null) {
            queryBody.setTimespan(LogsQueryHelper.toIso8601Format(timeInterval));
        }
        queryBody.setWorkspaces(getAllWorkspaces(options));
        RequestOptions requestOptions
            = new RequestOptions().setContext(context).setHeader(HttpHeaderName.PREFER, preferHeader);

        return innerClient
            .executeWithResourceIdWithResponse(resourceId, BinaryData.fromObject(queryBody), requestOptions)
            .map(response -> new SimpleResponse<>(response.getRequest(), response.getStatusCode(),
                response.getHeaders(), response.getValue().toObject(QueryResults.class)))
            .map(LogsQueryHelper::convertToLogQueryResult)
            .handle((Response<LogsQueryResult> response, SynchronousSink<Response<LogsQueryResult>> sink) -> {
                if (response.getValue().getQueryResultStatus() == LogsQueryResultStatus.PARTIAL_FAILURE
                    && !options.isAllowPartialErrors()) {

                    sink.error(new ServiceResponseException("Query execution returned partial errors. To "
                        + "disable exceptions on partial errors, set setAllowPartialErrors in "
                        + "LogsQueryOptions to true."));
                } else {
                    sink.next(response);
                }
            });
    }
}
