
import java.util.Stack;
import java.util.Set; // Using Set for efficient operator lookup
import java.util.HashSet;

public class ValidateExpressionWithSteps {

    // Define allowed operators
    private static final Set<Character> OPERATORS = new HashSet<>(Set.of('+', '-', '*', '/'));

    /**
     * Checks if a given mathematical expression string is valid based on
     * parenthesis balancing and operator placement rules.
     *
     * @param expression The input string expression.
     * @return true if the expression is valid, false otherwise.
     */
    public static boolean isValidExpression(String expression) {
        if (expression == null || expression.trim().isEmpty()) {
            return true; // Or false, depending on requirements for empty strings
        }

        // --- Step 1: Get Ready ---
        Stack<Character> parenthesisStack = new Stack<>(); // Stack for '('
        boolean lastWasOperator = true; // Assume start allows operand or '('
        boolean lastWasOpenParen = true; // Assume start allows operand or '('
        // boolean lastWasOperand = false; // Optional: Can track operands if needed for
        // stricter rules

        // --- Step 2: Read Character by Character ---
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            // Ignore whitespace
            if (Character.isWhitespace(c)) {
                continue;
            }

            // --- Step 3: If c is '(' ---
            if (c == '(') {
                parenthesisStack.push(c); // Push onto stack
                // Update flags: Expect operand or another '(' next
                lastWasOperator = true;
                lastWasOpenParen = true;
                // lastWasOperand = false;
            }
            // --- Step 4: If c is ')' ---
            else if (c == ')') {
                // Check Errors: No matching '(' or operator right before ')'?
                if (parenthesisStack.isEmpty() || lastWasOperator) {
                    return false; // Invalid Expression
                }
                parenthesisStack.pop(); // Pop the matching '('
                // Update flags: Expect operator or end next
                lastWasOperator = false;
                lastWasOpenParen = false;
                // lastWasOperand = true; // Treat ')' as ending an operand/sub-expression
            }
            // --- Step 6: If c is an Operator ---
            else if (OPERATORS.contains(c)) {
                // Check Errors: Operator after another operator or after '('?
                if (lastWasOperator || lastWasOpenParen) {
                    return false; // Invalid Expression
                }
                // Update flags: Expect operand or '(' next
                lastWasOperator = true;
                lastWasOpenParen = false;
                // lastWasOperand = false;
            }
            // --- Step 5: If c is an Operand (Letter/Digit) ---
            else if (Character.isLetterOrDigit(c)) {
                // No specific error check here based on previous char in this simplified model
                // Update flags: Expect operator or ')' next
                lastWasOperator = false;
                lastWasOpenParen = false;
                // lastWasOperand = true;
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
        // (Ensure it wasn't just an opening paren, which is handled by stack check)
        if (lastWasOperator && parenthesisStack.isEmpty()) { // Check stack empty to avoid false positive on just "("
            return false; // Invalid
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
        String expr15 = ""; // Valid (or false based on requirements)
        String expr16 = "("; // Invalid

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

    }

}
