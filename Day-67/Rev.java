public class Rev {
    public static void main(String[] args) {
        String str = "Hello World!";
        String reverseBuild = new StringBuilder(str).reverse().toString();
        System.out.println(reverseBuild);

        // for loop
        StringBuilder rev = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            rev.append(str.charAt(i));
        }
        System.out.println(rev);
    }

}
