
// Import necessary tools: List for results, Set for memory, Queue for the waiting line
import java.util.*;

// Class name, like a container for our code
class RemoveInvalidParenthesis {

    /**
     * Helper Check 1: Is this character a parenthesis?
     * Like asking: "Is this a left sock '(' or a right sock ')'?"
     * 
     * @param c The character to check.
     * @return true if it's '(' or ')', false otherwise.
     */
    static boolean isParenthesis(char c) {
        // Return true if the character is either an opening or closing parenthesis
        return ((c == '(') || (c == ')'));
    }

    /**
     * Helper Check 2: Is this string valid?
     * Like asking: "Does every left sock '(' have a matching right sock ')' after
     * it?"
     * 
     * @param str The string to check.
     * @return true if parentheses are balanced, false otherwise.
     */
    static boolean isValidString(String str) {
        int cnt = 0; // Start a counter for open left socks '('

        // Look at each character in the string, one by one
        for (int i = 0; i < str.length(); i++) {
            // If we see a left sock '('
            if (str.charAt(i) == '(') {
                cnt++; // Increase the count of open left socks
            }
            // If we see a right sock ')'
            else if (str.charAt(i) == ')') {
                cnt--; // Decrease the count (we found a partner for a left sock)
            }

            // IMPORTANT CHECK: If count ever becomes negative...
            if (cnt < 0) {
                // ...it means we found a right sock ')' without a left sock '(' partner before
                // it!
                // This string is definitely invalid!
                return false; // Stop checking and say it's invalid
            }
        }
        // After checking all characters, the string is valid ONLY if the count is
        // exactly 0.
        // This means every left sock '(' found a matching right sock ')'.
        return (cnt == 0);
    }

    /**
     * Main Method: Remove minimum parentheses to make the string valid.
     * This is the explorer that finds the shortest fixed strings.
     * 
     * @param str The input string with potentially extra parentheses.
     */
    static void removeInvalidParenthesis(String str) {
        // If the input string is empty, there's nothing to do!
        if (str.isEmpty()) {
            return;
        }

        // Tool 1: The Memory List (Set)
        // We use a HashSet called 'visit' to remember which strings we've already seen
        // or
        // put in our 'to-do' list. This stops us from doing the same work again.
        HashSet<String> visit = new HashSet<String>();

        // Tool 2: The Waiting Line (Queue)
        // We use a Queue called 'q' (like a real line) to hold strings we need to
        // check.
        // It follows First-In, First-Out (FIFO).
        Queue<String> q = new LinkedList<>();

        // A temporary variable to hold new strings we create
        String temp;

        // Tool 3: The Light Switch (Boolean Flag)
        // This flag 'level' tells us if we've found *any* valid string yet at the
        // current shortest length.
        // It starts OFF (false).
        boolean level = false;

        // --- Start the Exploration ---

        // Step 1: Add the starting string to the waiting line (q)
        // and mark it as seen in our memory list (visit).
        q.add(str);
        visit.add(str);

        // Step 2: Keep exploring as long as there are strings in the waiting line (q).
        while (!q.isEmpty()) {

            // Step 3: Get the next string from the front of the waiting line.
            // Peek looks at the front, remove takes it off.
            str = q.peek();
            q.remove();

            // Step 4: Check if this string is valid (perfectly paired socks).
            if (isValidString(str)) {
                // SUCCESS! We found a valid string.
                System.out.println(str); // Print it out as a possible answer.

                // Turn the light switch ON!
                // This tells us we've found the minimum number of removals needed.
                // We don't need to look for strings that require *more* removals.
                level = true;
            }

            // Step 5: Check the light switch.
            if (level) {
                // If the light is ON, it means we already found valid answers at this shortest
                // level.
                // We should NOT try to remove more parentheses from the current 'str'.
                // Just continue to the next string waiting in the queue (from the same level).
                continue;
            }

            // Step 6: Generate shorter strings (if the light is OFF and 'str' wasn't
            // valid).
            // Try removing each parenthesis one by one.
            for (int i = 0; i < str.length(); i++) {

                // Check if the character at position 'i' is actually a parenthesis.
                if (!isParenthesis(str.charAt(i))) {
                    // If it's not a parenthesis (like 'v'), skip it. We only remove parentheses.
                    continue;
                }

                // Create a new string 'temp' by removing the parenthesis at position 'i'.
                // It takes the part before 'i' and adds the part after 'i'.
                temp = str.substring(0, i) + str.substring(i + 1);

                // Step 7: Check memory and add to waiting line if new.
                // Ask the memory list: "Have we seen this 'temp' string before?"
                if (!visit.contains(temp)) {
                    // If NO (it's brand new!):
                    // 1. Add 'temp' to the back of the waiting line (q) to check later.
                    q.add(temp);
                    // 2. Add 'temp' to the memory list (visit) so we don't process it again.
                    visit.add(temp);
                }
                // If YES (we've seen 'temp' before), do nothing. Avoid repeating work.
            }
        } // End of the while loop (exploration ends when the queue is empty)
    }

    // Main part of the program where we test our function
    public static void main(String[] args) {
        // Example 1
        String expression1 = "()())()";
        System.out.println("Input: " + expression1);
        System.out.println("Output:");
        removeInvalidParenthesis(expression1); // Call the explorer function
        System.out.println("----------"); // Separator for clarity

        // Example 2
        String expression2 = "(v)())()"; // Note: Changed from "()v)" in original GFG code to match user example
        System.out.println("Input: " + expression2);
        System.out.println("Output:");
        removeInvalidParenthesis(expression2); // Call the explorer function
        System.out.println("----------");

        // Example 3 (from original GFG code)
        String expression3 = "()v)";
        System.out.println("Input: " + expression3);
        System.out.println("Output:");
        removeInvalidParenthesis(expression3); // Call the explorer function
        System.out.println("----------");
    }
}
