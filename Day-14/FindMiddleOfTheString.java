import java.util.Scanner;

public class FindMiddleOfTheString {

    public static void main(String[] args) {
        System.out.print("Enter a String : ");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(printMiddleString(scanner.nextLine()));

        }
    }

    private static String printMiddleString(String input) {

        String result = "";
        int length = input.length();
        if (length % 2 == 0) {
            return result + input.charAt((length / 2) - 1) + input.charAt((length / 2));
        } else {
            return result + input.charAt((length / 2));
        }

    }
}