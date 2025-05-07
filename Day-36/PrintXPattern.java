// P         M
//  R      A
//    O  R
//      G
//   O    R
//  R       A
// P          M 

import java.util.Scanner;
import java.util.Arrays;
import java.util.Scanner;

public class PrintXPattern {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter an odd‑length string: ");
            String word = sc.nextLine();
            int n = word.length();
            if (n % 2 == 0) {
                throw new IllegalArgumentException("String length must be odd");
            }

            // Buffer to build each row
            char[] row = new char[n];

            // Single loop with two pointers i and j = n-1-i
            for (int i = 0; i < n; i++) {
                Arrays.fill(row, ' ');               // O(n) fill with spaces 
                int j = n - 1 - i;
                // Place the two diagonal characters
                row[i] = word.charAt(i);             // left‑to‑right diagonal :contentReference[oaicite:3]{index=3}
                row[j] = word.charAt(j);             // right‑to‑left diagonal :contentReference[oaicite:4]{index=4}
                System.out.println(row);             // single I/O per row
            }
        }
    }
}

