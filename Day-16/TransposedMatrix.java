public class TransposedMatrix {

    public static void main(String[] args) {
        int[][] numbers = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
        };

        System.out.println("Original Matrix:");
        printMatrix(numbers);

        transposeInPlace(numbers);

        System.out.println("Matrix Transposed:");
        printMatrix(numbers);
    }

    private static void transposeInPlace(int[][] A) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int tmp  = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = tmp;
            }
        }
    }

    // Helper to print any 2D matrix
    private static void printMatrix(int[][] M) {
        for (int[] row : M) {
            for (int v : row) {
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }
}
