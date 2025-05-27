import java.util.Arrays;

public class HeapSort {

    public static void main(String[] args) {
        int[] numbers = { 4, 10, 3, 5, 1 };
        performHeapSort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));
    }

    private static void performHeapSort(int[] numbers) {
        int size = numbers.length;

        // Step 1: Build Max Heap
        for (int i = size / 2 - 1; i >= 0; i--) {
            heapify(numbers, size, i);

        }

        // step 2 : Extract the elements from the heap
        for (int i = size - 1; i >= 0; i--) {

            // Move current root (largest) to the end
            swap(numbers, 0, i);

            // Rebuild the heap for the reduced array;
            heapify(numbers, i, 0);



        }

    }

    private static void heapify(int[] numbers, int size, int rootIndex) {

        int largest = rootIndex;
        int leftChild = 2 * rootIndex + 1;
        int rightChild = 2 * rootIndex + 2;

        // check if left child is larger than root
        if (leftChild < size && numbers[leftChild] > numbers[largest]) {
            largest = leftChild;

        }
        // check if right child is larger the largest so far;
        if (rightChild < size && numbers[rightChild] > numbers[largest]) {
            largest = rightChild;
        }

        // if the largest is not the root, swap and heapify the affectied subtree
        if (largest != rootIndex) {
            swap(numbers, rootIndex, largest);
            heapify(numbers, size, largest);
        }

    }

    private static void swap(int[] numbers, int rootIndex, int largest) {

        int temp = numbers[rootIndex];
        numbers[rootIndex] = numbers[largest];
        numbers[largest] = temp;

    }

}
