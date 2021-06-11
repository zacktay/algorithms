import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ContainsDuplicates {

    public static boolean containsDuplicateUsingStream(int[] nums) {
        return Arrays.stream(nums)
                     .boxed()
                     .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                     .entrySet()
                     .stream()
                     .anyMatch(entry -> entry.getValue() > 1);
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> distinctNumbers = new HashSet<>();

        for (int value : nums) {
            if (distinctNumbers.contains(value)) {
                return true;
            }
            distinctNumbers.add(value);
        }

        return false;
    }

}
