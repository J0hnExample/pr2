package de.bht;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        
        TextAnalyzer analyzer = new TextAnalyzer("This is a test. This is another test. This is yet another test.");
        int count = analyzer.getCharacterCount('.');
        System.out.println(count);
    }

    
   static  public class TextAnalyzer {
    private Map<Character, Integer> characterCounts;

    public TextAnalyzer(String text) {
        characterCounts = new HashMap<>();
        char[] chars = text.toCharArray();

        for (char c : chars) {
            if (c == '.' || c == ',' || c == ';') {
                characterCounts.put(c, characterCounts.getOrDefault(c, 0) + 1);
            }
        }
    }

    public int getCharacterCount(char c) {
        return characterCounts.getOrDefault(c, 0);
    }
}
}