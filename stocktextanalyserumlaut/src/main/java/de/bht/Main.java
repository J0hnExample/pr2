package de.bht;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        
        TextAnalyzer analyzer = new TextAnalyzer("This is a test. This is another test. This is yet another test.");
        int countA = analyzer.getCharacterCount('a');
        int countE = analyzer.getCharacterCount('e');
        System.out.println("Count of 'a': " + countA);
        System.out.println("Count of 'e': " + countE);
    }

    static public class TextAnalyzer {
        // Map zur Speicherung der Anzahl jedes Charakters
        private Map<Character, Integer> characterCounts;
    
        public TextAnalyzer(String text) {
            // Initialisierung der HashMap zur Speicherung der Charakterzählungen
            characterCounts = new HashMap<>();
            // Umwandeln des Textes in ein Array von Charakteren
            char[] chars = text.toCharArray();
    
            // Durchlaufen aller Charaktere im Text
            for (char c : chars) {
                // Überprüfen, ob der aktuelle Charakter ein Vokal ist
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    // Verwendung von put, um den Charakter in die Map einzufügen oder dessen Zähler zu aktualisieren.
                    // getOrDefault wird verwendet, um den aktuellen Zähler für den Charakter zu erhalten, 
                    // wobei 0 als Standardwert dient, falls der Charakter noch nicht in der Map vorhanden ist.
                    characterCounts.put(c, characterCounts.getOrDefault(c, 0) + 1);
                }
            }
        }
    
        public int getCharacterCount(char c) {
            // Verwendung von getOrDefault, um die Anzahl des angegebenen Charakters zurückzugeben.
            // Falls der Charakter nicht in der Map vorhanden ist, wird 0 zurückgegeben.
            return characterCounts.getOrDefault(c, 0);
        }
    }
}
