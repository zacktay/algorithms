import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LongestCommonPrefix {

    public static String getLongestCommonPrefix(String[] strs) {
        List<String> strings = Arrays.stream(strs).collect(Collectors.toList());
        if (strings.size() == 1) {
            return strs[0];
        }

        // Get Max Allowed Length
        int maxLength = strings.stream().map(String::length).min(Comparator.comparing(Integer::intValue)).orElse(0);

        // String Builder to build result
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < maxLength; i++) {
            String subString = strs[0].substring(0, i+1);
            if (strings.stream().allMatch(each -> each.startsWith(subString))) {
                result.append(strs[0].charAt(i));
            } else {
                break;
            }
        }

        return result.toString();
    }

}
