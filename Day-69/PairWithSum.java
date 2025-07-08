import java.util.HashSet;

public class PairWithSum {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 6, 7, 3, 9, 2};
        int targetSum = 10;
        findPairs(numbers, targetSum);
    }

    private static void findPairs(int[] numbers, int targetSum) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : numbers) {
            int complement = targetSum - num;
            if (seen.contains(complement)) {
                System.out.println("Pair: (" + num + ", " + complement + ")");
            }
            seen.add(num);
        }
    }
}
