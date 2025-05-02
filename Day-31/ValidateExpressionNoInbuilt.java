import java.util.Arrays; // Only needed for Arrays.toString in main

public class ValidateExpressionNoInbuilt {

    // --- Custom Stack Implementation using char array ---
    private static class PrimitiveCharStack {
        private char[] stackArray;
        private int top; // Index of the top element, -1 if empty
        private int capacity;

        public PrimitiveCharStack(int size) {
            capacity = size;
            stackArray = new char[capacity];
            top = -1; // Stack is initially empty
        }

        // Push operation
        public boolean push(char value) {
            if (isFull()) {
                // System.err.println("Stack Overflow! Cannot push " + value);
                // In a real scenario, might resize or throw exception
                return false; // Indicate failure (e.g., too many nested parens)
            }
            stackArray[++top] = value; // Increment top, then insert
            return true;
        }

        // Pop operation
        public char pop() {
            if (isEmpty()) {
                // System.err.println("Stack Underflow! Cannot pop.");
                // Return a special character or throw exception
                return '\0'; // Null character indicates error/empty
            }
            return stackArray[top--]; // Return top element, then decrement top
        }

        // Peek operation (optional, not strictly needed for this problem)
        public char peek() {
            if (isEmpty()) {
                return '\0'; // Null character indicates error/empty
            }
            return stackArray[top];
        }

        // Check if stack is empty
        public boolean isEmpty() {
            return (top == -1);
        }

        // Check if stack is full
        public boolean isFull() {
            return (top == capacity - 1);
        }
    }
    // --- End of Custom Stack Implementation ---

    /**
     * Helper method to check if a character is one of the allowed operators.
     * Replaces the need for a Set.
     * 
     * @param c Character to check.
     * @return true if the character is '+', '-', '*', or '/'.
     */
    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    /**
     * Checks if a given mathematical expression string is valid based on
     * parenthesis balancing and operator placement rules, using primitive types.
     *
     * @param expression The input string expression.
     * @return true if the expression is valid, false otherwise.
     */
    public static boolean isValidExpression(String expression) {
        if (expression == null) {
            return false; // Or true depending on requirements
        }
        String trimmedExpression = expression.trim();
        if (trimmedExpression.isEmpty()) {
            return true; // Or false, depending on requirements for empty strings
        }

        // --- Step 1: Get Ready ---
        // Estimate max stack size (e.g., length of expression for worst case like
        // "((("))
        PrimitiveCharStack parenthesisStack = new PrimitiveCharStack(trimmedExpression.length());
        boolean lastWasOperator = true; // Assume start allows operand or '('
        boolean lastWasOpenParen = true; // Assume start allows operand or '('

        // --- Step 2: Read Character by Character ---
        for (int i = 0; i < trimmedExpression.length(); i++) {
            char c = trimmedExpression.charAt(i);

            // Ignore whitespace (already trimmed, but good practice if not)
            // if (Character.isWhitespace(c)) { continue; } // Not needed after trim()

            // --- Step 3: If c is '(' ---
            if (c == '(') {
                if (!parenthesisStack.push(c)) { // Push onto custom stack
                    return false; // Stack overflow (too many nested parens for capacity)
                }
                // Update flags: Expect operand or another '(' next
                lastWasOperator = true;
                lastWasOpenParen = true;
            }
            // --- Step 4: If c is ')' ---
            else if (c == ')') {
                // Check Errors: No matching '(' or operator right before ')'?
                // Also check if pop fails (underflow, though isEmpty check covers it)
                if (parenthesisStack.isEmpty() || lastWasOperator) {
                    return false; // Invalid Expression
                }
                parenthesisStack.pop(); // Pop the matching '(' from custom stack
                // Update flags: Expect operator or end next
                lastWasOperator = false;
                lastWasOpenParen = false;
            }
            // --- Step 6: If c is an Operator ---
            else if (isOperator(c)) { // Use helper function instead of Set.contains
                // Check Errors: Operator after another operator or after '('?
                if (lastWasOperator || lastWasOpenParen) {
                    return false; // Invalid Expression
                }
                // Update flags: Expect operand or '(' next
                lastWasOperator = true;
                lastWasOpenParen = false;
            }
            // --- Step 5: If c is an Operand (Letter/Digit) ---
            // Using a simple check, can be expanded if needed
            else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')) {
                // No specific error check here based on previous char in this simplified model
                // Update flags: Expect operator or ')' next
                lastWasOperator = false;
                lastWasOpenParen = false;
            }
            // --- Step 7: If c is anything else ---
            else {
                return false; // Invalid character, Invalid Expression
            }
        } // --- End of Loop ---

        // --- Step 8: After the Loop (Final Checks) ---

        // Check 1: Unmatched opening parentheses?
        if (!parenthesisStack.isEmpty()) {
            return false; // Invalid
        }

        // Check 2: Ends with an operator?
        // (Need to be careful here, as the last valid char might have been ')')
        if (lastWasOperator) {
            return false; // Invalid (cannot end with an operator)
        }

        // If all checks passed
        return true; // Valid Expression
    }

    public static void main(String[] args) {
        String expr1 = "(a+b)(a*b)"; // Valid
        String expr2 = "(ab)(ab+)"; // Invalid (ends with operator before ')')
        String expr3 = "((a+b)"; // Invalid (unmatched '(')
        String expr4 = "a+b*c"; // Valid
        String expr5 = "(a+b)*c"; // Valid
        String expr6 = "a+(b*c)"; // Valid
        String expr7 = "a++b"; // Invalid (consecutive operators)
        String expr8 = "(a+)"; // Invalid (operator before ')')
        String expr9 = "(*b)"; // Invalid (operator after '(')
        String expr10 = "a+"; // Invalid (ends with operator)
        String expr11 = ")a+b("; // Invalid (starts with ')', unmatched '(')
        String expr12 = "(a)(b)"; // Valid (implicit multiplication allowed by logic)
        String expr13 = "()"; // Valid
        String expr14 = "(())"; // Valid
        String expr15 = ""; // Valid (handled by initial check)
        String expr16 = "("; // Invalid
        String expr17 = "   ( a + b )   "; // Valid (handles whitespace)

        System.out.println("\"" + expr1 + "\" is valid: " + isValidExpression(expr1)); // true
        System.out.println("\"" + expr2 + "\" is valid: " + isValidExpression(expr2)); // false
        System.out.println("\"" + expr3 + "\" is valid: " + isValidExpression(expr3)); // false
        System.out.println("\"" + expr4 + "\" is valid: " + isValidExpression(expr4)); // true
        System.out.println("\"" + expr5 + "\" is valid: " + isValidExpression(expr5)); // true
        System.out.println("\"" + expr6 + "\" is valid: " + isValidExpression(expr6)); // true
        System.out.println("\"" + expr7 + "\" is valid: " + isValidExpression(expr7)); // false
        System.out.println("\"" + expr8 + "\" is valid: " + isValidExpression(expr8)); // false
        System.out.println("\"" + expr9 + "\" is valid: " + isValidExpression(expr9)); // false
        System.out.println("\"" + expr10 + "\" is valid: " + isValidExpression(expr10)); // false
        System.out.println("\"" + expr11 + "\" is valid: " + isValidExpression(expr11)); // false
        System.out.println("\"" + expr12 + "\" is valid: " + isValidExpression(expr12)); // true
        System.out.println("\"" + expr13 + "\" is valid: " + isValidExpression(expr13)); // true
        System.out.println("\"" + expr14 + "\" is valid: " + isValidExpression(expr14)); // true
        System.out.println("\"" + expr15 + "\" is valid: " + isValidExpression(expr15)); // true
        System.out.println("\"" + expr16 + "\" is valid: " + isValidExpression(expr16)); // false
        System.out.println("\"" + expr17 + "\" is valid: " + isValidExpression(expr17)); // true

    }
}
