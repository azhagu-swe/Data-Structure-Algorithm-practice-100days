import java.util.Arrays;
import java.util.List;

public class StreamFilter {
    public static void main(String[] args) {

        List<Integer> array = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        List<Integer> uniqueArray = array.stream().filter((num) -> num > 1).toList();
        System.out.println(uniqueArray);
    }

}
