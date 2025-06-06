// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The language codes supported for input text by TextTranslationSkill.
 */
public final class TextTranslationSkillLanguage extends ExpandableStringEnum<TextTranslationSkillLanguage> {
    /**
     * Afrikaans.
     */
    @Generated
    public static final TextTranslationSkillLanguage AF = fromString("af");

    /**
     * Arabic.
     */
    @Generated
    public static final TextTranslationSkillLanguage AR = fromString("ar");

    /**
     * Bangla.
     */
    @Generated
    public static final TextTranslationSkillLanguage BN = fromString("bn");

    /**
     * Bosnian (Latin).
     */
    @Generated
    public static final TextTranslationSkillLanguage BS = fromString("bs");

    /**
     * Bulgarian.
     */
    @Generated
    public static final TextTranslationSkillLanguage BG = fromString("bg");

    /**
     * Cantonese (Traditional).
     */
    @Generated
    public static final TextTranslationSkillLanguage YUE = fromString("yue");

    /**
     * Catalan.
     */
    @Generated
    public static final TextTranslationSkillLanguage CA = fromString("ca");

    /**
     * Chinese Simplified.
     */
    @Generated
    public static final TextTranslationSkillLanguage ZH_HANS = fromString("zh-Hans");

    /**
     * Chinese Traditional.
     */
    @Generated
    public static final TextTranslationSkillLanguage ZH_HANT = fromString("zh-Hant");

    /**
     * Croatian.
     */
    @Generated
    public static final TextTranslationSkillLanguage HR = fromString("hr");

    /**
     * Czech.
     */
    @Generated
    public static final TextTranslationSkillLanguage CS = fromString("cs");

    /**
     * Danish.
     */
    @Generated
    public static final TextTranslationSkillLanguage DA = fromString("da");

    /**
     * Dutch.
     */
    @Generated
    public static final TextTranslationSkillLanguage NL = fromString("nl");

    /**
     * English.
     */
    @Generated
    public static final TextTranslationSkillLanguage EN = fromString("en");

    /**
     * Estonian.
     */
    @Generated
    public static final TextTranslationSkillLanguage ET = fromString("et");

    /**
     * Fijian.
     */
    @Generated
    public static final TextTranslationSkillLanguage FJ = fromString("fj");

    /**
     * Filipino.
     */
    @Generated
    public static final TextTranslationSkillLanguage FIL = fromString("fil");

    /**
     * Finnish.
     */
    @Generated
    public static final TextTranslationSkillLanguage FI = fromString("fi");

    /**
     * French.
     */
    @Generated
    public static final TextTranslationSkillLanguage FR = fromString("fr");

    /**
     * German.
     */
    @Generated
    public static final TextTranslationSkillLanguage DE = fromString("de");

    /**
     * Greek.
     */
    @Generated
    public static final TextTranslationSkillLanguage EL = fromString("el");

    /**
     * Haitian Creole.
     */
    @Generated
    public static final TextTranslationSkillLanguage HT = fromString("ht");

    /**
     * Hebrew.
     */
    @Generated
    public static final TextTranslationSkillLanguage HE = fromString("he");

    /**
     * Hindi.
     */
    @Generated
    public static final TextTranslationSkillLanguage HI = fromString("hi");

    /**
     * Hmong Daw.
     */
    @Generated
    public static final TextTranslationSkillLanguage MWW = fromString("mww");

    /**
     * Hungarian.
     */
    @Generated
    public static final TextTranslationSkillLanguage HU = fromString("hu");

    /**
     * Icelandic.
     */
    @Generated
    public static final TextTranslationSkillLanguage IS = fromString("is");

    /**
     * Indonesian.
     */
    @Generated
    public static final TextTranslationSkillLanguage ID = fromString("id");

    /**
     * Italian.
     */
    @Generated
    public static final TextTranslationSkillLanguage IT = fromString("it");

    /**
     * Japanese.
     */
    @Generated
    public static final TextTranslationSkillLanguage JA = fromString("ja");

    /**
     * Kiswahili.
     */
    @Generated
    public static final TextTranslationSkillLanguage SW = fromString("sw");

    /**
     * Klingon.
     */
    @Generated
    public static final TextTranslationSkillLanguage TLH = fromString("tlh");

    /**
     * Klingon (Latin script).
     */
    @Generated
    public static final TextTranslationSkillLanguage TLH_LATN = fromString("tlh-Latn");

    /**
     * Klingon (Klingon script).
     */
    @Generated
    public static final TextTranslationSkillLanguage TLH_PIQD = fromString("tlh-Piqd");

    /**
     * Korean.
     */
    @Generated
    public static final TextTranslationSkillLanguage KO = fromString("ko");

    /**
     * Latvian.
     */
    @Generated
    public static final TextTranslationSkillLanguage LV = fromString("lv");

    /**
     * Lithuanian.
     */
    @Generated
    public static final TextTranslationSkillLanguage LT = fromString("lt");

    /**
     * Malagasy.
     */
    @Generated
    public static final TextTranslationSkillLanguage MG = fromString("mg");

    /**
     * Malay.
     */
    @Generated
    public static final TextTranslationSkillLanguage MS = fromString("ms");

    /**
     * Maltese.
     */
    @Generated
    public static final TextTranslationSkillLanguage MT = fromString("mt");

    /**
     * Norwegian.
     */
    @Generated
    public static final TextTranslationSkillLanguage NB = fromString("nb");

    /**
     * Persian.
     */
    @Generated
    public static final TextTranslationSkillLanguage FA = fromString("fa");

    /**
     * Polish.
     */
    @Generated
    public static final TextTranslationSkillLanguage PL = fromString("pl");

    /**
     * Portuguese.
     */
    @Generated
    public static final TextTranslationSkillLanguage PT = fromString("pt");

    /**
     * Portuguese (Brazil).
     */
    @Generated
    public static final TextTranslationSkillLanguage PT_BR = fromString("pt-br");

    /**
     * Portuguese (Portugal).
     */
    @Generated
    public static final TextTranslationSkillLanguage PT_PT = fromString("pt-PT");

    /**
     * Queretaro Otomi.
     */
    @Generated
    public static final TextTranslationSkillLanguage OTQ = fromString("otq");

    /**
     * Romanian.
     */
    @Generated
    public static final TextTranslationSkillLanguage RO = fromString("ro");

    /**
     * Russian.
     */
    @Generated
    public static final TextTranslationSkillLanguage RU = fromString("ru");

    /**
     * Samoan.
     */
    @Generated
    public static final TextTranslationSkillLanguage SM = fromString("sm");

    /**
     * Serbian (Cyrillic).
     */
    @Generated
    public static final TextTranslationSkillLanguage SR_CYRL = fromString("sr-Cyrl");

    /**
     * Serbian (Latin).
     */
    @Generated
    public static final TextTranslationSkillLanguage SR_LATN = fromString("sr-Latn");

    /**
     * Slovak.
     */
    @Generated
    public static final TextTranslationSkillLanguage SK = fromString("sk");

    /**
     * Slovenian.
     */
    @Generated
    public static final TextTranslationSkillLanguage SL = fromString("sl");

    /**
     * Spanish.
     */
    @Generated
    public static final TextTranslationSkillLanguage ES = fromString("es");

    /**
     * Swedish.
     */
    @Generated
    public static final TextTranslationSkillLanguage SV = fromString("sv");

    /**
     * Tahitian.
     */
    @Generated
    public static final TextTranslationSkillLanguage TY = fromString("ty");

    /**
     * Tamil.
     */
    @Generated
    public static final TextTranslationSkillLanguage TA = fromString("ta");

    /**
     * Telugu.
     */
    @Generated
    public static final TextTranslationSkillLanguage TE = fromString("te");

    /**
     * Thai.
     */
    @Generated
    public static final TextTranslationSkillLanguage TH = fromString("th");

    /**
     * Tongan.
     */
    @Generated
    public static final TextTranslationSkillLanguage TO = fromString("to");

    /**
     * Turkish.
     */
    @Generated
    public static final TextTranslationSkillLanguage TR = fromString("tr");

    /**
     * Ukrainian.
     */
    @Generated
    public static final TextTranslationSkillLanguage UK = fromString("uk");

    /**
     * Urdu.
     */
    @Generated
    public static final TextTranslationSkillLanguage UR = fromString("ur");

    /**
     * Vietnamese.
     */
    @Generated
    public static final TextTranslationSkillLanguage VI = fromString("vi");

    /**
     * Welsh.
     */
    @Generated
    public static final TextTranslationSkillLanguage CY = fromString("cy");

    /**
     * Yucatec Maya.
     */
    @Generated
    public static final TextTranslationSkillLanguage YUA = fromString("yua");

    /**
     * Irish.
     */
    @Generated
    public static final TextTranslationSkillLanguage GA = fromString("ga");

    /**
     * Kannada.
     */
    @Generated
    public static final TextTranslationSkillLanguage KN = fromString("kn");

    /**
     * Maori.
     */
    @Generated
    public static final TextTranslationSkillLanguage MI = fromString("mi");

    /**
     * Malayalam.
     */
    @Generated
    public static final TextTranslationSkillLanguage ML = fromString("ml");

    /**
     * Punjabi.
     */
    @Generated
    public static final TextTranslationSkillLanguage PA = fromString("pa");

    /**
     * Creates a new instance of TextTranslationSkillLanguage value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public TextTranslationSkillLanguage() {
    }

    /**
     * Creates or finds a TextTranslationSkillLanguage from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding TextTranslationSkillLanguage.
     */
    @Generated
    public static TextTranslationSkillLanguage fromString(String name) {
        return fromString(name, TextTranslationSkillLanguage.class);
    }

    /**
     * Gets known TextTranslationSkillLanguage values.
     * 
     * @return known TextTranslationSkillLanguage values.
     */
    @Generated
    public static Collection<TextTranslationSkillLanguage> values() {
        return values(TextTranslationSkillLanguage.class);
    }
}
