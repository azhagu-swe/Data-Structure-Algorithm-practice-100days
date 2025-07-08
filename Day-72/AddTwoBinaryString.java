public class AddTwoBinaryString {

    public static void main(String[] args) {
         String s1 = "1101";
        String s2 = "111";

        System.out.println(addBinary(s1, s2));
    }
    public static String addBinary(String s1,String s2){

        // Trim Leading Zeros
        s1=trimLeadingZeros(s1);
        s2=trimLeadingZeros(s1);
        int n=s1.length();
        int m=s2.length();
        
        // swap the strings if s1 is of smaller length
        if(n<m){
            return addBinary(s2, s1);
        }
        int j=m-1;
        int carry=0;
                StringBuilder result = new StringBuilder();

        // Traverse both string from the end
        for(int i=n-1;i>=0;i--){
            
            // current bit of s1
            int bit1=s1.charAt(i)-'0';
            int sum=bit1+carry;

            // if there are remaining bits in s2, add them 
            // to the sum
            if(j>=0){

                //current bit of s2
                int bit2=s2.charAt(j)-'0';
                sum+=bit2;
                j--;
            }
            
            // calculate the result bit and update carry
            int bit=sum%2;
            carry=sum/2;

            result.append((char)(bit+'0'));

        }
        if(carry>0) result.append('1');


        return result.reverse().toString();
    }
    private static String trimLeadingZeros(String s) {

        // find the position of the first '1'
        int firstOne=s.indexOf('1');
        return (firstOne == -1)?"0":s.substring(firstOne);
    
    }
}