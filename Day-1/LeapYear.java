import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        System.out.print("Enter the Year : ");
        try (Scanner sc = new Scanner(System.in)) {
            year = sc.nextInt();
            if (year <= 0) {
                throw new IllegalArgumentException("Year should be Positive!");
            }

            // Combined condition: leap if divisible by 400 or (divisible by 4 and not
            // divisible by 100)
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println("Leap year!");
            } else {
                System.out.println("Not Leap year!");
            }
        }
    }
}
