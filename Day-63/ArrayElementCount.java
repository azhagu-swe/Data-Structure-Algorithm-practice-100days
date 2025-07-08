import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayElementCount {
    public static void main(String[] args) {

        int[] arr = { 2, 9, 3, 42, 1, 36, 7, 8, 3, 4, 64, 1, 2, 3, 34, 5, 6, 7 };
        arr = IntStream.of(arr).sorted().toArray();
        System.out.println(Arrays.toString(arr));
        Map<Integer, Long> couMap = Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println(couMap);
    }

}
