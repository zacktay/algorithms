import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;

public class TwoSum {

    public static int[] compute(int[] nums, int target) {
        // Lookup map to keep index of complements
        Map<Integer, Integer> complementToIndexMap = new HashMap<>();

        // Look through all elements of the array
        for (int i = 0; i < nums.length; i++) {
            // get current num
            int curr = nums[i];
            Integer complement = target - curr;

            // Check if complement exists
            Integer indexOfComplement = complementToIndexMap.get(complement);
            // Return Index of Current and Index of Complement
            if (Objects.nonNull(indexOfComplement)) {
                System.out.printf("[Two Sum] Found numbers that add up to %s at index %s (%s) and %s (%s)%n",
                                  target,
                                  i,
                                  curr,
                                  indexOfComplement,
                                  complement);
                return Stream.of(i, indexOfComplement).mapToInt(x -> x).sorted().toArray();
            }
            complementToIndexMap.putIfAbsent(curr, i);
        }

        // Return empty array if not found
        System.out.printf("[Two Sum] no matching numbers found for %s%n", target);
        return new int[2];
    }

}
