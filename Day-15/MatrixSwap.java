import java.util.Scanner;

public class MatrixSwap {

    public static void main(String[] args) {
        int[][] numbers = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println("Original Matrix:");
        printMatrix(numbers);

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter first row to swap (1-indexed): ");
            int row1 = scanner.nextInt() - 1;
            System.out.print("Enter second row to swap (1-indexed): ");
            int row2 = scanner.nextInt() - 1;

            // Validate that the row indices are within the valid range.
            if (row1 < 0 || row1 >= numbers.length || row2 < 0 || row2 >= numbers.length) {
                System.out.println("Invalid row index. Please enter values between 1 and " + numbers.length);
                return;
            }

            if (row1 == row2) {
                System.out.println("Both rows are the same. No swap needed.");
            } else {
                // Swap the entire row references.
                int[] temp = numbers[row1];
                numbers[row1] = numbers[row2];
                numbers[row2] = temp;
            }

            System.out.println("Matrix after swapping rows:");
            printMatrix(numbers);
        }
    }

    // Helper method to print a 2D matrix.
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
