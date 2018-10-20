package com.fntzy.core;

import com.fntzy.core.model.Discipline;
import com.fntzy.core.model.AttributeName;

import java.util.List;
import java.util.function.ToIntFunction;

import static com.fntzy.core.model.RankAttributeMaps.primaryRankToAttributeMap;
import static com.fntzy.core.model.RankAttributeMaps.secondaryRankToAttributeMap;
import static com.fntzy.core.model.RankAttributeMaps.tertiaryRankToAttributeMap;

public class AttributeGenerator {

    private static final int BASE = 5;

    public static int generateStatScore(AttributeName attributeName, List<Discipline> disciplines) {
        ToIntFunction<Discipline> statsFromDisciplines = (discipline) -> {
            if (discipline.getPrimary() == attributeName) {
                return primaryRankToAttributeMap().get(discipline.getRank());
            } else if (discipline.getSecondary() == attributeName) {
                return secondaryRankToAttributeMap().get(discipline.getRank());
            } else if (discipline.getTertiary() == attributeName) {
                return tertiaryRankToAttributeMap().get(discipline.getRank());
            }
            return 0;
        };

        return disciplines.stream().mapToInt(statsFromDisciplines).sum() + BASE;
    }
}
