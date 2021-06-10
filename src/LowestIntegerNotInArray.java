import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class LowestIntegerNotInArray {

    public static int getLowestPositiveIntegerNotInArray(int[] nums) {
        // Set of Positive Numbers
        Set<Integer> positiveNumbers = Arrays.stream(nums)
                                             .filter(each -> each > 0)
                                             .boxed()
                                             .collect(Collectors.toSet());

        // Keep adding until we have a number that's not in the set
        int result = 1;
        while (positiveNumbers.contains(result)) {
            result++;
        }

        return result;
    }

}
