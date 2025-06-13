import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DetectDuplicate {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 6 ,1,2};

        boolean isDuplicate = false;
        Set<Integer> set = new HashSet<>();
        for (int n : arr) {
            if (!set.add(n)) {
                isDuplicate = true;
                break;
            }
        }
        if (isDuplicate) {
            System.out.println("Arrays are duplicate");
        } else {
            System.out.println("not duplicate");
        }
        int len = Arrays.stream(arr).mapToObj(i -> i).distinct().collect(Collectors.toList()).size();
        if (len != arr.length)
            System.out.println("Arrays are duplicate");
        else
            System.out.println("not duplicate");

        Map<Integer, Long> map=Arrays.stream(arr).boxed().collect(Collectors.groupingBy(i->i,Collectors.counting()));
        System.out.println(map);
        boolean isDup=map.values().stream().anyMatch(count->count>1);
        System.out.println(isDup);
        Map<Integer,Long> dupMap=map.entrySet().stream().filter(entryset->entryset.getValue()>1).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue ));
        System.out.println(dupMap);

    }

}
