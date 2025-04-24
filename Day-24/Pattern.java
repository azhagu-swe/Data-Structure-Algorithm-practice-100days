
// Eg 1: Input: 12345
//        Output:
// 1       5
//   2   4
//     3
//   2  4
// 1      5
import java.util.Scanner;

public class Pattern {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a word : ");
            String input = scanner.nextLine();
            patternPrint(input);
        }
    }

    private static void patternPrint(String input) {
        if (input.length() % 2 == 0)
            throw new IllegalArgumentException("Please Enter odd length word!");
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < input.length(); j++) {
                if (i == j)
                    System.out.print(input.charAt(i));
                else if (j == input.length() - i - 1)
                    System.out.print(input.charAt(i));
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}