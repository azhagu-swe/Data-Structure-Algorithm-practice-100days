public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int index = recursiveBinarySearch(numbers, 8, 0, numbers.length - 1);
        System.out.println(index != -1 ? "Target index is : " + index : "Target not found!");
    }

    private static int binarySearch(int[] numbers, int target, int low, int high) {
        while (low <= high) {
            int middle = (high + low) / 2;
            if (numbers[middle] == target)
                return middle;
            if (numbers[middle] < target)
                low = middle + 1;
            else
                high = middle - 1;

        }
        return -1;
    }

    private static int recursiveBinarySearch(int[] numbers, int target, int low, int high) {
        if (low <= high) {
            int middle = (high + low) / 2;
            if (numbers[middle] == target)
                return middle;
            if (numbers[middle] < target)
                return recursiveBinarySearch(numbers, target, middle + 1, high);
            else
                return recursiveBinarySearch(numbers, target, low, middle - 1);

        }
        return -1;
    }

}
