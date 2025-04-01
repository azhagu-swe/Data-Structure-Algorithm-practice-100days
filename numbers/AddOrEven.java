import java.util.Scanner;

class AddOrEven {
    public static void main(String[] args) {
        int number;
        System.out.print("Enter a number: ");

        // Using try-with-resources to ensure the scanner is closed automatically
        // This is a good practice to avoid resource leaks
        try (Scanner scanner = new Scanner(System.in);) {
            number = scanner.nextInt();
            if (number <= 0) {
                // this condition checks if the number is positive
                // If the number is not positive, it prints a message and returns
                // without performing any further checks or calculations
                // System.out.println("Please enter a positive number.");
                // return;
                // or
                throw new IllegalArgumentException("Please enter a positive number." + number);
            }
            if (number % 2 == 0) {
                System.out.println("The number is even.");
            } else {
                System.out.println("The number is odd.");
            }
        }
        // * The above code can be simplified using the ternary operator to reduce
        // redundancy.
        // The ternary operator is a shorthand for an if-else statement
        // It takes three operands: a condition, a value if true, and a value if false.
        // The syntax is: condition ? value_if_true : value_if_false
        // In this case, we check if the number is even (number % 2 == 0).
        // If it is, we print "The number is even." Otherwise, we print "The number is
        // odd."
        System.out.println(number % 2 == 0 ? "The number is even." : "The number is odd.");
        ;
    }
}

/*
 * interview question and answers
 * 
 * Basic Questions
 * "How do you determine if a number is even or odd?"
 * (Expected Answer:
 * "Divide by 2. If the remainder is 0, it's even; otherwise, it's odd.")
 * 
 * "What operator do you use to check if a number is even?"
 * (Expected Answer: "The modulus (%) operator.")
 * 
 * Coding-Based Questions
 * "Can you write a simple program to check if a number is even or odd?"
 * (You would write a basic code snippet using if (num % 2 == 0).)
 * 
 * "How would you check for even or odd without using the modulus operator?"
 * (Possible Answer:
 * "Use bitwise operations like num & 1—if the last bit is 0, it's even; otherwise, it's odd."
 * )
 * 
 * Logical & Conceptual Questions
 * "What happens if the number is negative? Does the logic change?"
 * (Expected Answer:
 * "No, the logic remains the same. Negative numbers also follow the same even/odd rule."
 * )
 * 
 * "What is the time complexity of checking if a number is even or odd?"
 * (Expected Answer: "O(1) because it's a simple arithmetic operation.")
 */