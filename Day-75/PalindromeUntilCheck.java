public class PalindromeUntilCheck {
    public static void main(String[] args) {
        int num = 199;

      while (!palindrome(num)) {
        num=addDigits(num);
        
      }
      System.out.println(num);

        System.out.println("Palindrome found: " + num);
    }

    private static int addDigits(int num) {
        int sum=0;
       while(num>0){
            sum +=num%10;
            num /=10;
        }
        return sum;

    }

    private static boolean palindrome(int num) {
        int actualNum=num,rev=0;
        while(num>0){
            int lastDigit=num%10;
            rev =rev*10+lastDigit;
            num /=10 ;
        }
        return rev==actualNum;
    }

}
