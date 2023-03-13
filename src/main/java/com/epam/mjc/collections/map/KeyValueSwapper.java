package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> swappedMap = new HashMap<>();
        for (Map.Entry<Integer, String> entry : sourceMap.entrySet()) {
            String newKey = entry.getValue();
            int newValue = entry.getKey();
            if (swappedMap.containsKey(newKey) && swappedMap.get(newKey) < newValue) {
                continue;
            }
            swappedMap.put(newKey, newValue);
        }
        return swappedMap;
    }
}
