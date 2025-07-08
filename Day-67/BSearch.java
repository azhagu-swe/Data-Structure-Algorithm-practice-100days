public class BSearch {

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 9, start = 0, end = numbers.length - 1;
        int index = binarySearch(numbers, start, end, target);
        System.out.println(index);
    }

    private static int binarySearch(int[] numbers, int start, int end, int target) {
        if (start > end)
            return -1;

        int mid = start + (end - start) / 2;

        if (numbers[mid] == target)
            return mid;
        else if (numbers[mid] > target)
            return binarySearch(numbers, start, mid - 1, target);
        else if (numbers[mid] < target)
            return binarySearch(numbers, mid + 1, end, target);
        return -1;
    }
}