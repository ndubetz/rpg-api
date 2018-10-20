package com.fntzy.core.model;

import java.util.HashMap;
import java.util.Map;

public class RankAttributeMaps {

    private static final Map<Integer, Integer> primaryRankToAttributeMap = new HashMap<>();
    private static final Map<Integer, Integer> secondaryRankToAttributeMap = new HashMap<>();
    private static final Map<Integer, Integer> tertiaryRankToAttributeMap = new HashMap<>();

    static {
        primaryRankToAttributeMap.put(1, 1);
        primaryRankToAttributeMap.put(2, 2);
        primaryRankToAttributeMap.put(3, 3);
        primaryRankToAttributeMap.put(4, 4);
        primaryRankToAttributeMap.put(5, 6);
        primaryRankToAttributeMap.put(6, 7);
        primaryRankToAttributeMap.put(7, 8);
        primaryRankToAttributeMap.put(8, 10);
        primaryRankToAttributeMap.put(9, 13);

        secondaryRankToAttributeMap.put(1, 0);
        secondaryRankToAttributeMap.put(2, 0);
        secondaryRankToAttributeMap.put(3, 1);
        secondaryRankToAttributeMap.put(4, 2);
        secondaryRankToAttributeMap.put(5, 3);
        secondaryRankToAttributeMap.put(6, 4);
        secondaryRankToAttributeMap.put(7, 6);
        secondaryRankToAttributeMap.put(8, 8);
        secondaryRankToAttributeMap.put(9, 10);

        tertiaryRankToAttributeMap.put(1, 0);
        tertiaryRankToAttributeMap.put(2, 0);
        tertiaryRankToAttributeMap.put(3, 0);
        tertiaryRankToAttributeMap.put(4, 0);
        tertiaryRankToAttributeMap.put(5, 0);
        tertiaryRankToAttributeMap.put(6, 1);
        tertiaryRankToAttributeMap.put(7, 2);
        tertiaryRankToAttributeMap.put(8, 4);
        tertiaryRankToAttributeMap.put(9, 7);
    }

    public static Map<Integer, Integer> primaryRankToAttributeMap() {
        return primaryRankToAttributeMap;
    }

    public static Map<Integer, Integer> secondaryRankToAttributeMap() {
        return secondaryRankToAttributeMap;
    }

    public static Map<Integer, Integer> tertiaryRankToAttributeMap() {
        return tertiaryRankToAttributeMap;
    }


}
