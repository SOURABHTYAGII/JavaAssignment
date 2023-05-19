public class RepeatedCharacter {
        public static void main(String[] args) {
            String str = "india";
            char firstRepeatedChar = findFirstRepeatedCharacter(str);

            if (firstRepeatedChar != '\0') {
                System.out.println("The first repeated character in the string is: " + firstRepeatedChar);
            } else {
                System.out.println("No repeated character found in the string.");
            }
        }

        public static char findFirstRepeatedCharacter(String str) {
            int[] charCount = new int[127];

            for (char c: str.toCharArray()) {// c is a variable
                charCount[c]++;

                if (charCount[c] > 1) {
                    return c;
                }
            }

            return '\0'; // no repeated character found
        }
    }


