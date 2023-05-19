import java.util.Arrays;
import java.util.Collections;

public class SortArrayInDescending {
    public static void main(String[] args) {
        Integer[] numbers = {5, 2, 9, 1, 7};

        sortArrayDescending(numbers);
        System.out.println("Sorted array in descending order: " + Arrays.toString(numbers));
    }

    public static void sortArrayDescending(Integer[] arr) {
        Arrays.sort(arr, Collections.reverseOrder());
    }
}


