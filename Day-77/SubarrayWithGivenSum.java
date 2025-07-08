import java.util.HashMap;

public class SubarrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int target = 12;

        int[] result = findSubarray(arr, target);
        if (result.length == 0) {
            System.out.println("No subarray found.");
        } else {
            System.out.println("Subarray indices: [" + result[0] + ", " + result[1] + "]");
        }
    }

    private static int[] findSubarray(int[] arr, int target) {
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        int currentSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            if (currentSum == target) {
                return new int[]{0, i};
            }

            if (prefixSumMap.containsKey(currentSum - target)) {
                return new int[]{prefixSumMap.get(currentSum - target) + 1, i};
            }

            prefixSumMap.put(currentSum, i);
        }

        return new int[0]; // Return empty array if no subarray is found
    }
}
