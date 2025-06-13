public class FindLongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = { "flower", "flow", "flight" };
        System.out.println(commonLangestPrefix(strs));

    }

    private static String commonLangestPrefix(String[] strs) {
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            prefix=findComonPrefix(prefix,strs[i]);
            if(prefix.isEmpty()){
                return "";
            }

        }
        return prefix;
    }

    private static String findComonPrefix(String prefix, String string) {
        int i=0;
        int length= string.length()>prefix.length()?prefix.length():string.length();

        while (i<length&& string.charAt(i)==prefix.charAt(i)){
            i++;
        }
        return prefix.substring(0,i);
    }

}
