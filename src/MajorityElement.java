import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MajorityElement {

    public static int majorityElement(int[] nums) {
        int majorityCount = (nums.length + 1) / 2;

        return Arrays.stream(nums)
                     .boxed()
                     .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                     .entrySet()
                     .stream()
                     .filter(entry -> entry.getValue() >= majorityCount)
                     .findFirst()
                     .map(Map.Entry::getKey)
                     .orElse(0);
    }

}
