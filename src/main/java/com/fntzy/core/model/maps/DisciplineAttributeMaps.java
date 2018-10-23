package com.fntzy.core.model.maps;

import com.fntzy.core.model.enums.AttributeName;
import com.fntzy.core.model.enums.DisciplineName;
import com.fntzy.core.model.enums.SpecializationName;

import java.util.HashMap;
import java.util.Map;

import static com.fntzy.core.model.enums.AttributeName.*;
import static com.fntzy.core.model.enums.DisciplineName.*;
import static com.fntzy.core.model.enums.SpecializationName.*;

public class DisciplineAttributeMaps {

    private static final Map<DisciplineName, AttributeName> primaryDiscplineNameToAttributeMap = new HashMap<>();
    private static final Map<DisciplineName, AttributeName> secondaryDiscplineNameToAttributeMap = new HashMap<>();
    private static final Map<SpecializationName, AttributeName> tertiarySpecializationToAttributeMap = new HashMap<>();

    static {
        primaryDiscplineNameToAttributeMap.put(WEAPONSKILL, STRENGTH);
        primaryDiscplineNameToAttributeMap.put(ARCHERY, AGILITY);
        primaryDiscplineNameToAttributeMap.put(TACTICS, PERCEPTION);
        primaryDiscplineNameToAttributeMap.put(ENGINEERING, INTELLECT);
        primaryDiscplineNameToAttributeMap.put(NATURE, PERCEPTION);
        primaryDiscplineNameToAttributeMap.put(PIETY, SPIRIT);
        primaryDiscplineNameToAttributeMap.put(SCHOLASCTICISM, INTELLECT);
        primaryDiscplineNameToAttributeMap.put(ORATOR, SOCIABILITY);
        primaryDiscplineNameToAttributeMap.put(MARTIAL_ARTS, TOUGHNESS);
        primaryDiscplineNameToAttributeMap.put(THIEVERY, AGILITY);
        primaryDiscplineNameToAttributeMap.put(CRAFTING, TOUGHNESS);

        secondaryDiscplineNameToAttributeMap.put(WEAPONSKILL, AGILITY);
        secondaryDiscplineNameToAttributeMap.put(ARCHERY, PERCEPTION);
        secondaryDiscplineNameToAttributeMap.put(TACTICS, INTELLECT);
        secondaryDiscplineNameToAttributeMap.put(ENGINEERING, AGILITY);
        secondaryDiscplineNameToAttributeMap.put(NATURE, TOUGHNESS);
        secondaryDiscplineNameToAttributeMap.put(PIETY, SOCIABILITY);
        secondaryDiscplineNameToAttributeMap.put(SCHOLASCTICISM, PERCEPTION);
        secondaryDiscplineNameToAttributeMap.put(ORATOR, INTELLECT);
        secondaryDiscplineNameToAttributeMap.put(MARTIAL_ARTS, AGILITY);
        secondaryDiscplineNameToAttributeMap.put(THIEVERY, PERCEPTION);
        secondaryDiscplineNameToAttributeMap.put(CRAFTING, STRENGTH);

        tertiarySpecializationToAttributeMap.put(BERSERKER, TOUGHNESS);
        tertiarySpecializationToAttributeMap.put(DUELIST, PERCEPTION);

        tertiarySpecializationToAttributeMap.put(SNIPER, TOUGHNESS);
        tertiarySpecializationToAttributeMap.put(SLINGER, STRENGTH);

        tertiarySpecializationToAttributeMap.put(SINGLE_COMBAT, STRENGTH);
        tertiarySpecializationToAttributeMap.put(BATTLE_STRATEGY, PERCEPTION);

        tertiarySpecializationToAttributeMap.put(DESTRUCTION, TOUGHNESS);
        tertiarySpecializationToAttributeMap.put(IMPROVEMENT, SOCIABILITY);

        tertiarySpecializationToAttributeMap.put(ELEMENTALIST, INTELLECT);
        tertiarySpecializationToAttributeMap.put(SPIRITUALIST, SPIRIT);

        tertiarySpecializationToAttributeMap.put(ZEALOTRY, STRENGTH);
        tertiarySpecializationToAttributeMap.put(CHARITY, TOUGHNESS);

        tertiarySpecializationToAttributeMap.put(SCIENCE, AGILITY);
        tertiarySpecializationToAttributeMap.put(OCCULT, SPIRIT);

        tertiarySpecializationToAttributeMap.put(FELLOWSHIP, SPIRIT);
        tertiarySpecializationToAttributeMap.put(BEGUILER, PERCEPTION);

        tertiarySpecializationToAttributeMap.put(MA_STRENGTH, STRENGTH);
        tertiarySpecializationToAttributeMap.put(MA_PERCEPTION, PERCEPTION);

        tertiarySpecializationToAttributeMap.put(THIEV_INTELLECT, INTELLECT);
        tertiarySpecializationToAttributeMap.put(THIEV_SOCIALABILITY, SOCIABILITY);

        tertiarySpecializationToAttributeMap.put(SMITHING, INTELLECT);
        tertiarySpecializationToAttributeMap.put(BREWING, SOCIABILITY);
    }

    public static Map<DisciplineName, AttributeName> primaryDiscplineNameToAttributeMap() {
        return primaryDiscplineNameToAttributeMap;
    }

    public static Map<DisciplineName, AttributeName> secondaryDiscplineNameToAttributeMap() {
        return secondaryDiscplineNameToAttributeMap;
    }

    public static Map<SpecializationName, AttributeName> tertiarySpecializationToAttributeMap() {
        return tertiarySpecializationToAttributeMap;
    }
}
