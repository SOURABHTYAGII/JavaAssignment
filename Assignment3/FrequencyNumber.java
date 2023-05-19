
import java.util.HashMap;
import java.util.Map;
    public class FrequencyNumber {
        public static void main(String[] args) {
            String str = "india";

            Map<Character, Integer> charFrequencyMap = new HashMap<>(); // Create a map to store character-frequency pairs

            for (char c : str.toCharArray()) { // Iterate through the string and count the occurrences of each character
                charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0) + 1);// Update the frequency count in the map
            }

            for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) { // Print the character-frequency pairs
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }


