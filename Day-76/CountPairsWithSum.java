import java.util.HashMap;

public class CountPairsWithSum {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int target = 6;

        System.out.println("Count of pairs: " + countPairs(arr, target));
    }

    private static int countPairs(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : arr) {
            int complement = target - num;

            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                count += map.get(complement);
            }

            // Add the current number to the map
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return count;
    }
}
