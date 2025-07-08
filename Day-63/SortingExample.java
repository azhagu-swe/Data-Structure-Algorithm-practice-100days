import java.util.List;
import java.util.stream.IntStream;

public class SortingExample {
    public static void main(String[] args) {
        int[] arr = { 2, 9, 3, 42, 1, 36, 7, 8 };

        // convert to List ascending
        List<Integer> sorted = IntStream.of(arr).sorted().boxed().toList();
        System.out.println(sorted);
        // Convert to List and sort in descending order
        List<Integer> sorted1 = IntStream.of(arr).boxed().sorted((a, b) -> b - a).toList();

        System.out.println(sorted1);

    }

}
