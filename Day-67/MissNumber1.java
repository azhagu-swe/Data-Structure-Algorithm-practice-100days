public class MissNumber1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = numbers.length + 1; // Total numbers including the missing one

        // Using Sum-based Approach
        int expectedSum = n * (n + 1) / 2; // Sum of first n natural numbers
        int actualSum = 0;
        for (int num : numbers) {
            actualSum += num; // Sum of array elements
        }
        System.out.println("Missing number (Sum approach): " + (expectedSum - actualSum));

        // Using XOR-based Approach
        int xorFull = 0; // XOR of all numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            xorFull ^= i;
        }

        int xorArray = 0; // XOR of all elements in the array
        for (int num : numbers) {
            xorArray ^= num;
        }

        System.out.println("Missing number (XOR approach): " + (xorFull ^ xorArray));
    }
}
