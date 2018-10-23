package com.fntzy.core.model.maps;

import java.util.HashMap;
import java.util.Map;

public class RankAttributeMaps {

    private static final Map<Integer, Integer> primaryRankToAttributeMap = new HashMap<>();
    private static final Map<Integer, Integer> secondaryRankToAttributeMap = new HashMap<>();
    private static final Map<Integer, Integer> tertiaryRankToAttributeMap = new HashMap<>();

    static {
        primaryRankToAttributeMap.put(1, 2);
        primaryRankToAttributeMap.put(2, 3);
        primaryRankToAttributeMap.put(3, 4);
        primaryRankToAttributeMap.put(4, 6);
        primaryRankToAttributeMap.put(5, 8);
        primaryRankToAttributeMap.put(6, 10);
        primaryRankToAttributeMap.put(7, 11);
        primaryRankToAttributeMap.put(8, 13);
        primaryRankToAttributeMap.put(9, 16);

        secondaryRankToAttributeMap.put(1, 0);
        secondaryRankToAttributeMap.put(2, 1);
        secondaryRankToAttributeMap.put(3, 2);
        secondaryRankToAttributeMap.put(4, 3);
        secondaryRankToAttributeMap.put(5, 5);
        secondaryRankToAttributeMap.put(6, 6);
        secondaryRankToAttributeMap.put(7, 8);
        secondaryRankToAttributeMap.put(8, 10);
        secondaryRankToAttributeMap.put(9, 12);

        tertiaryRankToAttributeMap.put(1, 0);
        tertiaryRankToAttributeMap.put(2, 0);
        tertiaryRankToAttributeMap.put(3, 0);
        tertiaryRankToAttributeMap.put(4, 0);
        tertiaryRankToAttributeMap.put(5, 0);
        tertiaryRankToAttributeMap.put(6, 2);
        tertiaryRankToAttributeMap.put(7, 4);
        tertiaryRankToAttributeMap.put(8, 6);
        tertiaryRankToAttributeMap.put(9, 8);
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
