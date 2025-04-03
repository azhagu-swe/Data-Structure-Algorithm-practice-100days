import java.util.Scanner;

public class CheckEndWithString {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a start String: ");
            String s1 = sc.nextLine();
            System.out.print("Enter an End String: ");
            String s2 = sc.nextLine();
            System.out.println(isSentenceEndWith(s1, s2)
                    ? "The sentence ends with " + s2
                    : "The sentence doesn't end with " + s2);
        }
    }

    private static boolean isSentenceEndWith(String s1, String s2) {
        if (s1 == null || s2 == null) return false;
        int len1 = s1.length(), len2 = s2.length();
        if (len2 > len1) return false;
        // Compare characters from the end of s1 with s2 from the beginning
        for (int i = 0; i < len2; i++) {
            if (s1.charAt(len1 - len2 + i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
