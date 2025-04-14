import java.util.Scanner;

public class StringExpander {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the compressed string: ");
            String input = sc.nextLine();
            System.out.println("Expanded string: " + expandString(input));
        }
    }

    private static String expandString(String str) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            char ch = str.charAt(i);
            i++;
            StringBuilder numStr = new StringBuilder();

            // Capture full number (in case of multi-digit like '10')
            while (i < str.length() && Character.isDigit(str.charAt(i))) {
                numStr.append(str.charAt(i));
                i++;
            }

            int count = Integer.parseInt(numStr.toString());

            // Append character 'count' times
            for (int j = 0; j < count; j++) {
                result.append(ch);
            }
        }
        return result.toString();
    }
}

