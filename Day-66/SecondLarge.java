import java.util.Arrays;
import java.util.stream.IntStream;

public class SecondLarge {
    public static void main(String[] args) {
        int[] numbers = { 10, 30, 20, 27 };
        int largest = numbers[0], sndLargest = numbers[0];
        for (int num : numbers) {
        if (num > largest) {
        sndLargest = largest;
        largest = num;
        } else if (num > sndLargest && num != largest) {
        sndLargest = num;

        }
        }
        System.out.println(sndLargest);
       
    }

}