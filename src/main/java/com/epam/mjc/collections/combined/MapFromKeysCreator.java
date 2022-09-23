package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> map = new HashMap<>();
        for (String string : sourceMap.keySet()){
            int length = string.length();
            if (map.containsKey(length)){
                map.get(length).add(string);
            }
            else {
                Set<String> values = new HashSet<>();
                values.add(string);
                map.put(length, values);
            }
        }
        return map;
    }
}
