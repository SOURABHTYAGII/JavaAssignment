public class PrimeNoumber {
        public static void main(String[] args) {
            int number = 20;

            String result = isPrime(number) ? " is a prime number." : " is not a prime number.";
            System.out.println(number+result);
        }

        public static boolean isPrime(int number) {
            return number > 1 && (number == 2 || number % 2 != 0) && (number == 3 || number % 3 != 0)
                    && (number == 5 || number % 5 != 0);// && (number == 7 || number % 7 != 0);
        }
    }


