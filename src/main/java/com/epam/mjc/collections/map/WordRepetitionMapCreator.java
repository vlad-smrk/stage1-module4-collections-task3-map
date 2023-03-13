package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        String[] words = sentence.split("\\W+");
        Map<String, Integer> result = new HashMap<>();
        for (String word : words) {
            word = word.toLowerCase();
            int count = result.getOrDefault(word, 0);
            result.put(word, count + 1);
        }
        return result;
    }
}
