import java.util.Arrays; // Needed for Arrays.toString()

public class UnionOfArraySimple {

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 2, 3 }; // Example array a
        int[] b = { 3, 6, 2, 7, 1 };      // Example array b

        // Get the array of unique elements in the union
        int[] unionArray1 = getUnionArray(a, b);
        // The count is the length of the resulting array
        int unionCount1 = unionArray1.length;

        System.out.println("Example 1:");
        System.out.println("Union count = " + unionCount1); // Output: 7
        System.out.println("Union array = " + Arrays.toString(unionArray1)); // Output: [1, 2, 3, 4, 5, 6, 7]

        System.out.println("\nExample 2:");
        int[] a2 = {85, 25, 1, 32, 54, 6};
        int[] b2 = {85, 2};
        int[] unionArray2 = getUnionArray(a2, b2);
        System.out.println("Union count = " + unionArray2.length); // Output: 7
        System.out.println("Union array = " + Arrays.toString(unionArray2)); // Output: [85, 25, 1, 32, 54, 6, 2]

        System.out.println("\nExample 3:");
        int[] a3 = {1, 2, 1, 1, 2};
        int[] b3 = {2, 2, 1, 2, 1};
        int[] unionArray3 = getUnionArray(a3, b3);
        System.out.println("Union count = " + unionArray3.length); // Output: 2
        System.out.println("Union array = " + Arrays.toString(unionArray3)); // Output: [1, 2]
    }

    /**
     * Calculates the union of two arrays using a brute-force approach
     * without sorting or HashSets. It first combines the arrays and then
     * filters for unique elements.
     * Runs in roughly O((n+m)^2) time and O(n+m) space.
     *
     * @param a The first array.
     * @param b The second array.
     * @return A new array containing the distinct elements present in the union of a and b.
     */
    public static int[] getUnionArray(int[] a, int[] b) {
        if (a == null || b == null) {
            // Return an empty array or handle as appropriate
            return new int[0];
        }

        // 1. Create a temporary combined array
        int n = a.length;
        int m = b.length;
        // Handle potential empty arrays
        if (n == 0 && m == 0) return new int[0];
        if (n == 0) return getUnionArray(b, a); // Reuse logic for single non-empty array
        if (m == 0) {
             // Need to handle single array case to remove its own duplicates
             a = Arrays.copyOf(a, n); // Create a copy to avoid modifying original if needed
             b = new int[0]; // Ensure b is empty for the logic below
             n = a.length;
             m = 0;
        }


        int[] combined = new int[n + m];
        int index = 0;

        // Copy elements from 'a'
        for (int val : a) {
            combined[index++] = val;
        }
        // Copy elements from 'b'
        for (int val : b) {
            combined[index++] = val;
        }

        // 2. Find unique elements in the combined array and store them
        // Create a temporary array to store unique elements found
        int[] uniqueElementsTemp = new int[combined.length];
        int uniqueCount = 0; // Counter for unique elements found

        for (int i = 0; i < combined.length; i++) {
            // Assume the current element is unique until proven otherwise
            boolean isUnique = true;

            // 3. Check if this element has appeared *before* this position (i)
            //    in the 'combined' array.
            for (int j = 0; j < i; j++) {
                if (combined[i] == combined[j]) {
                    isUnique = false; // Found a duplicate earlier in the array
                    break; // No need to check further back
                }
            }

            // 4. If it's unique (wasn't found earlier), add it to our temp unique array
            if (isUnique) {
                uniqueElementsTemp[uniqueCount] = combined[i];
                uniqueCount++;
            }
        }

        // 5. Create the final result array with the exact size needed
        int[] finalUnionArray = new int[uniqueCount];
        // Copy the unique elements from the temporary array to the final array
        for(int i=0; i < uniqueCount; i++){
            finalUnionArray[i] = uniqueElementsTemp[i];
        }
        // System.arraycopy(uniqueElementsTemp, 0, finalUnionArray, 0, uniqueCount); // Alternative copy method

        return finalUnionArray;
    }
}
