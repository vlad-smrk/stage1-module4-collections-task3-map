package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {

        String[] words = sentence.split("\\W+");
        if (Objects.equals(words[0], "")) {
            return new HashMap<>();
        }

        Map<String, Integer> result = new HashMap<>();
        for (String word : words) {
            word = word.toLowerCase();
            int count = result.getOrDefault(word, 0);
            result.put(word, count + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        Map<String, Integer> test = new WordRepetitionMapCreator().createWordRepetitionMap("");
        System.out.println(test);
    }
}
