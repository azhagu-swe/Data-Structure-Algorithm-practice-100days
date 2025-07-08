// Reverse a String
// Write a Java program to reverse a given string without using any built-in functions or libraries.
public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String reverse = reverseInPlace(str);
        System.out.println("String : " + str);
        System.out.println("Reverse String : " + reverse);
    }

    private static String reverseString(String str) {
        if (str == null) {
            return str;
        }
        String reverse = "";
        int length = str.length() - 1;
        for (int i = length; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        return reverse;
    }

    // Option B: Manual char[] swap
    public static String reverseInPlace(String str) {
        if (str == null)
            return null;
        char[] arr = str.toCharArray();
        int start = 0, end = arr.length-1;
        while (start < end) {
            char temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
        return new String(arr);
    }

}
