import java.util.Scanner;

public class SwapColumnArray {
    public static void main(String[] args) {
        int[][] numbers = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println("Original Matrix:");
        printMatrix(numbers);

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter first column to swap (1-indexed): ");
            int col1 = scanner.nextInt() - 1;
            System.out.print("Enter second column to swap (1-indexed): ");
            int col2 = scanner.nextInt() - 1;

            // Validate that the column indices are within [0 .. numCols-1]
            int numCols = numbers[0].length;
            if (col1 < 0 || col1 >= numCols || col2 < 0 || col2 >= numCols) {
                System.out.println("Invalid column index. Please enter values between 1 and " + numCols);
                return;
            }
            if (col1 == col2) {
                System.out.println("Both columns are the same. No swap needed.");
                return;
            }

            // Swap the two columns by iterating each row once
            // :contentReference[oaicite:1]{index=1}
            for (int row = 0; row < numbers.length; row++) {
                int tmp = numbers[row][col1];
                numbers[row][col1] = numbers[row][col2];
                numbers[row][col2] = tmp;
            }

            System.out.println("Matrix after swapping columns:");
            printMatrix(numbers);
        }
    }

    // Helper method to print a 2D matrix.
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int v : row) {
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }
}
