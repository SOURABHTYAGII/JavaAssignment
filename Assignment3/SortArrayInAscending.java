import java.util.Arrays;

public class SortArrayInAscending {
        public static void main(String[] args) {
            int[] numbers = {4, 2, 6, 1, 18};
          int sort =  sortArray(numbers);

            System.out.println("Sorted array in ascending order: " + Arrays.toString(numbers));
        }
        public static int sortArray(int[] array) {
            Arrays.sort(array);

            return 0;
        }
    }


