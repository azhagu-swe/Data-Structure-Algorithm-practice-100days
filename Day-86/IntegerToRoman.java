public class IntegerToRoman {
    public String intToRoman(int num) {
        // Arrays of Roman numeral symbols and their corresponding values
        String[] romanSymbols = {
            "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
        };
        int[] values = {
            1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1
        };
        
        StringBuilder result = new StringBuilder();

        // Iterate over the values and symbols arrays
        for (int i = 0; i < values.length; i++) {
            // Append the Roman symbol while the number is greater or equal to the value
            while (num >= values[i]) {
                result.append(romanSymbols[i]);
                num -= values[i];
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        IntegerToRoman converter = new IntegerToRoman();
        
        // Test cases
        System.out.println(converter.intToRoman(3749)); // Output: MMMDCCXLIX
        System.out.println(converter.intToRoman(58));   // Output: LVIII
        System.out.println(converter.intToRoman(1994)); // Output: MCMXCIV
    }
}
