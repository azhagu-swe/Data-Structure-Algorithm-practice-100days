
public class ZigzagConversion {
    public static void main(String[] args) {

        String s1 = "PAYPALISHIRING";
        int numRow1 = 3;
        System.out.println("output : " + convert(s1, numRow1));

    }

    private static String convert(String s1, int numRow1) {

        if (numRow1 == 1 || s1.length() <= numRow1)
            return s1;
        StringBuilder[] rows = new StringBuilder[numRow1];
        for (int i = 0; i < numRow1; i++) {
            rows[i] = new StringBuilder();

        }
        int currRow = 0;
        boolean goingDown = false;

        for (char c : s1.toCharArray()) {

            rows[currRow].append(c);
            if(currRow==0 || currRow== numRow1-1){
                goingDown= !goingDown;
            }
            currRow +=goingDown?1:-1;
        }
        StringBuilder result=new StringBuilder();
        for(StringBuilder row: rows){
            result.append(row);
        }
        return result.toString();

    }

}
