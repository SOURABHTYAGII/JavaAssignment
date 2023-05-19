import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateArray {

        public static void main(String[] args) {

            List<Integer> numbers  = new ArrayList<>();
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            numbers.add(2);
            numbers.add(4);
            numbers.add(1);

            System.out.println("ArrayList with duplicates: " + numbers); // Print the ArrayList before removing duplicates

            List<Integer> uniqueNumbers = new ArrayList<>(); // Remove duplicates
            for (Integer number : numbers) {
                if (uniqueNumbers.contains(number)) {
                    continue;
                }
                uniqueNumbers.add(number);
            }

            numbers.clear(); // Update the original ArrayList
            numbers.addAll(uniqueNumbers);

            System.out.println("ArrayList without duplicates: " + numbers);   // Print the ArrayList after removing duplicates
        }
    }


