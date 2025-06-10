public class AToIString {

    public static void main(String[] args) {
           String s = "  -0012g4";
        System.out.println(myAtoi(s));
        
    }

    private static int myAtoi(String s) {

        int sign=1,res=0,idx=0;

        // Ignore leading white space
        while(idx<s.length() && s.charAt(idx)==' '){
            idx++;
        }
        //Store the sign number;
        if(idx<s.length() && (s.charAt(idx)=='-' || s.charAt(idx)=='+')){
            if(s.charAt(idx++)=='-') sign=-1;
        }
        // construct the number digit by digit
        while(idx<s.length() && s.charAt(idx)>=0 && s.charAt(idx)<='9'){


            if(res> Integer.MAX_VALUE/10 ||(res==Integer.MAX_VALUE/10 && s.charAt(idx)-'0'>7)){
                return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            // append current digit to the result
            res=10* res+(s.charAt(idx++)-'0');
        }

        return res*sign;
     
    }
}