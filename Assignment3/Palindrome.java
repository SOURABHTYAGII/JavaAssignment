public class Palindrome {
        public static void main(String[] args) {
            String str = "radar";

            boolean Palindrome=checkPalindrome(str);

            if (Palindrome) {
                System.out.println("The string '" + str + "' is a palindrome.");
            } else {
                System.out.println("The string '" + str + "' is not a palindrome.");
            }
        }

        public static boolean checkPalindrome(String str) {
            String reversedStr = new StringBuilder(str).reverse().toString();
            return str.equals(reversedStr);
        }
    }


