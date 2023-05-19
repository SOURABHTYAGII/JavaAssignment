public class Factorial {
        public static void main(String[] args) {
            int number = 5;

            int factorial = calculateFactorial(number);

            System.out.println("The factorial of " + number+ "  " + factorial);
        }
        public static int calculateFactorial(int x) {
            return (x == 0) ? 1 : x* calculateFactorial(x-1);
        }
    }


