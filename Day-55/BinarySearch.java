public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target = 7;
        int index = recursionBinarySearch(arr, 0, arr.length, target);
        int alternative=getIndexBinarySearch(arr, target);
        System.out.println(index);

    }

    public static int recursionBinarySearch(int[] arr, int low, int high, int target) {
        int mid = (low + high) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] > target)
            return recursionBinarySearch(arr, low, mid - 1, target);
        else
            return recursionBinarySearch(arr, mid + 1, high, target);

    }

    public static int getIndexBinarySearch(int[] arr, int target) {

        int low = 0, high = arr.length;

        int mid = (low + high) / 2;

        while (mid <= high) {
            if (arr[mid] == target)
                return mid;
            if (arr[mid] < target)
                mid++;
            else if (arr[mid] > target)
                mid--;

        }

        return -1;

    }

}
