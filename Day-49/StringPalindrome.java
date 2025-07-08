public class StringPalindrome {

    public static void main(String[] args) {

        String str = "aammaa";
        boolean isPalindrome = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome ? "String is Palindrome" : "String is not Palindrome");
    }
}