public class Fibonacciseries {
        public static void main(String[] args) {
            int limitnoumber = 50;

            System.out.println("Fibonacci series up to " + limitnoumber+"");
           int fibonacci= generateFibonacciSeries(limitnoumber);
        }

        public static int generateFibonacciSeries(int limit) {
            int a = 0;
            int b = 2;

            while (a <= limit) {
                System.out.print(a + " ");

                a = a + b;
                b = a - b;
            }
            return limit;
        }
    }


