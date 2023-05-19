import java.util.HashSet;
import java.util.Set;
public class DuplicateCharacterFinder {

    public static void main(String[] args) {
            String str = "Indian Flag";

            Set<Character> duplicates = new HashSet<>(); // Create a set to store duplicate characters

        Set<Character> seen = new HashSet<>();// Create a set to store characters seen so far

        for (char c : str.toCharArray()) { // Iterate through the string and check for duplicates

            if (seen.contains(c)) { // Check if the character is already seen
                    duplicates.add(c);
                } else {
                    seen.add(c);
                }
            }

        System.out.println("Duplicate characters in the string: " + duplicates);// Print the duplicate characters
        }
    }


