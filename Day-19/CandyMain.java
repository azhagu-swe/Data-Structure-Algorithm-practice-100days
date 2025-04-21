
import java.util.Arrays;
import java.util.Scanner;

public class CandyMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ratings separated by spaces: ");
        String[] tokens = sc.nextLine().trim().split("\\s+");
        int[] ratings = Arrays.stream(tokens)
                .mapToInt(Integer::parseInt)
                .toArray();
        sc.close();

        int minCandies = candy(ratings);
        System.out.println("Minimum candies needed: " + minCandies);
    }

    public static int candy(int[] ratings) {
        int n = ratings.length;
        if (n == 0)
            return 0;

        // Step 1: give each child 1 candy by default
        int[] candies = new int[n];
        Arrays.fill(candies, 1);

        // Step 2: left-to-right pass to satisfy left neighbor constraint
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        // Step 3: right-to-left pass to satisfy right neighbor constraint and sum total
        int total = candies[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
            total += candies[i];
        }

        return total;
    }
}
