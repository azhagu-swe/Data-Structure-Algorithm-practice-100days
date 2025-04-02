import java.util.Scanner;

public class DuckNumber {

    public static void main(String[] args) {

        int number;
        System.out.print("Enter a Number : ");
        try (Scanner scanner = new Scanner(System.in)) {
            number = scanner.nextInt();
            System.out.println(isDuckNumber(number) ? "Duck Number " : "Not Duck Number!");

        }

    }

    public static boolean isDuckNumber(int number) {
        boolean isDuck = false;
        while (number != 0) {
            int lastDigit = number % 10;
            if (lastDigit == 0) {

                return !isDuck;
            }
            number /= 10;

        }
        return isDuck;
    }

}
// import java.util.Scanner;

// public class DuckNumber {

//     public static void main(String[] args) {
//         System.out.print("Enter a Number: ");
//         try (Scanner scanner = new Scanner(System.in)) {
//             String number = scanner.next(); // Read input as a String
//             System.out.println(isDuckNumber(number) ? "Duck Number!" : "Not a Duck Number!");
//         }
//     }

//     public static boolean isDuckNumber(String number) {
//         // A Duck number must NOT start with '0' but contain at least one '0' elsewhere
//         if (number.charAt(0) == '0') return false; 
        
//         return number.contains("0");
//     }
// }

