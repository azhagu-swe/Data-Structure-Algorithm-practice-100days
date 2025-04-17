public class SymmetricMatrix {
    public static void main(String[] args) {
        int[][] numbers = {
                { 1, 2, 3 },
                { 2, 5, 6 },
                { 3, 6, 9 }
        };

        System.out.println("Matrix is:");
        printMatrix(numbers);

        System.out.println(isSymmetric(numbers) ? "Symmetric" : "Asymmetric");
    }

    /**
     * Returns true if `mat` is square and mat[i][j] == mat[j][i] for all i<j.
     * Time: O(n²), Space: O(1) :contentReference[oaicite:0]{index=0}
     */
    private static boolean isSymmetric(int[][] mat) {
        // Null or empty matrix — define as symmetric
        if (mat == null || mat.length == 0)
            return true;

        int n = mat.length;
        // Check for square shape
        for (int[] row : mat) {
            if (row == null || row.length != n) {
                return false;
            }
        }

        // Only need to compare entries above the main diagonal
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (mat[i][j] != mat[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void printMatrix(int[][] M) {
        for (int[] row : M) {
            for (int v : row) {
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }
}
