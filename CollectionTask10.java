//Write a program to find the highest frequency of a character in a given string
import java.util.HashMap;
import java.util.Map;

public class CollectionTask10 {
    public static void main(String[] args) {
        String str = "hello world";

        // Create a HashMap to store character frequencies
        Map<Character, Integer> charFreqMap = new HashMap<>();

        // Iterate through the string and count character frequencies
        for (char c : str.toCharArray()) {
            if (charFreqMap.containsKey(c)) {
                charFreqMap.put(c, charFreqMap.get(c) + 1);
            } else {
                charFreqMap.put(c, 1);
            }
        }

        // Find the character with the highest frequency
        char highestFreqChar = '\0'; // '\0' represents null character
        int maxFrequency = 0;

        for (Map.Entry<Character, Integer> entry : charFreqMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                highestFreqChar = entry.getKey();
            }
        }

        // Print the character with the highest frequency
        System.out.println("Character with the highest frequency: " + highestFreqChar);
        System.out.println("Frequency: " + maxFrequency);
    }
}
