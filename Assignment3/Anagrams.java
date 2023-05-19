import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        boolean isAnagram = checkAnagram(str1, str2);

        if (isAnagram) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }

    public static boolean checkAnagram(String str1, String str2) {

        str1 = str1.replaceAll("\\s", "").toLowerCase();  // Remove spaces and convert to lowercase
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) { // Check if lengths are different
            return false;
        }

        // Convert strings to character arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);   // Sort the character arrays
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2); // Compare sorted arrays
    }
}
