public class GasStation {
 
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length; // Number of gas stations (checkpoints)

      
        int totalGas = 0;
        int totalCost = 0;
        for (int i = 0; i < n; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
        }

       
        if (totalGas < totalCost) {
            return -1;
        }

    
        int currentTank = 0; // Represents the gas currently in the tank (candies in the tummy).
        int startStation = 0; // Represents the potential starting station index (checkpoint).

        // Iterate through all stations once.
        for (int i = 0; i < n; i++) {
            // Simulate traveling from station i to i+1
            // Add gas collected at station i, subtract cost to travel to i+1.
            // Analogy: Collect candies at checkpoint i, eat candies to run to i+1.
            currentTank += gas[i] - cost[i];

            // If the tank goes negative, it means we cannot reach station i+1
            // starting from the current 'startStation'.
            // Analogy: Uh oh! Ran out of candies before reaching the next checkpoint.
            if (currentTank < 0) {
                // This means the current 'startStation' (and any station between it and i)
                // cannot be the correct starting point.
                // The earliest possible *new* starting point must be the *next* station (i+1).
                // Analogy: If starting at 'startStation' got us stuck here, the only hope is
                // to try starting fresh from the *next* checkpoint.
                startStation = i + 1;
                // Reset the tank as if we are starting fresh from the new 'startStation'.
                // Analogy: Empty the tummy to start clean from the new checkpoint.
                currentTank = 0;
            }
        }

        // Because we passed the initial 'totalGas >= totalCost' check,
        // we are guaranteed that the loop finds the unique valid starting station.
        return startStation;
    }

    // Example Usage (optional, for testing)
    public static void main(String[] args) {
        GasStation sol = new GasStation();

        int[] gas1 = { 1, 2, 3, 4, 5 };
        int[] cost1 = { 3, 4, 5, 1, 2 };
        System.out.println("Example 1 Output: " + sol.canCompleteCircuit(gas1, cost1)); // Expected: 3

        int[] gas2 = { 2, 3, 4 };
        int[] cost2 = { 3, 4, 3 };
        System.out.println("Example 2 Output: " + sol.canCompleteCircuit(gas2, cost2)); // Expected: -1
    }
}