
public class REverseStringWord {
    public static void main(String[] args) {
        String  s="the sky is blue";
        System.out.println(reverseWord(s));
    }

    private static String reverseWord(String s) {
        if(s.isEmpty() || s==null){
            return "";

        }
        String splitString[]=s.trim().split("\\s+"); 
        StringBuilder result=new StringBuilder();

        for(int i=splitString.length-1;i>=0;i--){
            result.append(splitString[i]);
            if(i>0) result.append(" ");
        }
        return result.toString();
    }
    
}
