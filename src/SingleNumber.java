import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        return Arrays.stream(nums)
                     .boxed()
                     .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                     .entrySet()
                     .stream()
                     .filter(entry -> entry.getValue() == 1)
                     .map(Map.Entry::getKey)
                     .findFirst()
                     .orElse(0);
    }

}
