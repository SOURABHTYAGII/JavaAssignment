import java.util.Arrays;

public class SmallestArray {
    public static void main(String[] args) {
        int[] numbers = {3, 2, 8, 1, 9};

        int smallest = findSmallestNumber(numbers);

        System.out.println("The smallest number in the array is: " + smallest);
    }
    public static int findSmallestNumber(int[] arr) {
        return Arrays.stream(arr).min().orElseThrow(() -> new IllegalArgumentException("Array cannot be empty"));
    }
}



