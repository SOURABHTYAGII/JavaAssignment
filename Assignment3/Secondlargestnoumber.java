import java.util.Arrays;

public class Secondlargestnoumber {
        public static void main(String[] args) {
            int[] numbers = {5, 2, 9, 1, 7};

            int secondLargest = findSecondLargestNumber(numbers);

            System.out.println("The second largest number in the array is: " + secondLargest);
        }

        public static int findSecondLargestNumber(int[] arr) {
            if (arr.length < 2) {
                throw new IllegalArgumentException("Array should have at least two elements");
            }

            int largest = Arrays.stream(arr).max().getAsInt();

            int secondLargest = Arrays.stream(arr).filter(num -> num != largest).max().getAsInt();

            return secondLargest;
        }
    }


