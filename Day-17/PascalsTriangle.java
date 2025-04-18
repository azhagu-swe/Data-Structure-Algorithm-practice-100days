import java.util.Scanner;

public class PascalsTriangle {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number : ");
            int n = scanner.nextInt();

            // One outer loop from 1 to (2n−1), one inner loop to print stars
            // :contentReference[oaicite:0]{index=0}
            for (int i = 1; i < 2 * n; i++) {
                // Determine how many stars this line should have:
                int stars = (i <= n) ? i : (2 * n - i);
                // Print that many stars, separated by spaces
                for (int j = 0; j < stars; j++) {
                    System.out.print("*");
                    if (j < stars - 1)
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
    }

}
