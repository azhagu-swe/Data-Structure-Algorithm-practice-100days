import java.util.Arrays;

public class InsertionSortTest {

    public static void main(String[] args) {
        int[] numbers = { 6, 5, 12, 10, 9, 1 };
        sortArrayUsingInsertion(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));
    }

    private static void sortArrayUsingInsertion(int[] numbers) {

        // Traverse second element
        for (int currentIndex = 1; currentIndex < numbers.length; currentIndex++) {
            int currentValue = numbers[currentIndex];
            int sortedIndex = currentIndex - 1;

            // shift elements of the sorted part to the right to make room for currentValue

            while (sortedIndex >= 0 && numbers[sortedIndex] > currentValue) {
                numbers[sortedIndex + 1] = numbers[sortedIndex];
                sortedIndex--; // Move one step left in the sorted part
            }
            // place currentValue at its correct position
            numbers[sortedIndex + 1] = currentValue;

        }

    }

}
