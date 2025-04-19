
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 25, 54, 44, 2, 34, 23, 39, 100 };
        int index = linearSearch(arr, 1000);
        System.out.println(index != -1 ? "Index of Target value : " + index : "Target not Found!");

    }

    private static int linearSearch(int[] arr, int target) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }

        return -1;
    }
}
