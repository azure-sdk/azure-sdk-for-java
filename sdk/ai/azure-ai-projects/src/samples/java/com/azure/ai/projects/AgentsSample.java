// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.ai.projects;

import com.azure.ai.agents.persistent.PersistentAgentsAdministrationClient;
import com.azure.ai.agents.persistent.PersistentAgentsClientBuilder;
import com.azure.ai.agents.persistent.models.CreateAgentOptions;
import com.azure.ai.agents.persistent.models.PersistentAgent;
import com.azure.core.util.Configuration;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class AgentsSample {

    private static PersistentAgentsAdministrationClient agentsClient
        = new PersistentAgentsClientBuilder().endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "endpoint"))
        .credential(new DefaultAzureCredentialBuilder().build())
        .buildPersistentAgentsAdministrationClient();

    public static void main(String[] args) {
        PersistentAgent createdAgent = createAgent();
        deleteAgent(createdAgent.getId());
    }

    public static PersistentAgent createAgent() {
        // BEGIN:com.azure.ai.projects.AgentsSample.createAgent

        String agentName = "basic_example";
        CreateAgentOptions createAgentOptions = new CreateAgentOptions("gpt-4o-mini")
            .setName(agentName)
            .setInstructions("You are a helpful agent");
        PersistentAgent agent = agentsClient.createAgent(createAgentOptions);
        System.out.println("Agent created: " + agent.getId());
        return agent;

        // END:com.azure.ai.projects.AgentsSample.createAgent
    }

    public static void deleteAgent(String agentId) {
        // BEGIN:com.azure.ai.projects.AgentsSample.deleteAgent

        agentsClient.deleteAgent(agentId);
        System.out.println("Agent deleted: " + agentId);

        // END:com.azure.ai.projects.AgentsSample.deleteAgent
    }
}
