import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] numbers = { 6, 5, 12, 10, 9, 1 };
        sortArrayUsingInsertion(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));
    }

    /**
     * Sorts the given array using the Insertion Sort algorithm.
     *
     * @param array the array to be sorted
     */
    private static void sortArrayUsingInsertion(int[] array) {
        // Traverse from the second element to the end
        for (int currentIndex = 1; currentIndex < array.length; currentIndex++) {
            int currentValue = array[currentIndex]; // The value to be inserted
            int sortedIndex = currentIndex - 1; // Start checking from the previous index in the sorted part

            // Shift elements of the sorted part to the right to make room for currentValue
            while (sortedIndex >= 0 && array[sortedIndex] > currentValue) {
                array[sortedIndex + 1] = array[sortedIndex];
                sortedIndex--; // Move one step left in the sorted part
            }

            // Place currentValue at its correct position
            array[sortedIndex + 1] = currentValue;
        }
    }
}
