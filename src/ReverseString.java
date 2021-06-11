import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseString {

    public static char[] reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;

        while (start < end) {
            char tmp = s[end];
            s[end] = s[start];
            s[start] = tmp;

            start++;
            end--;
        }

        return s;
    }

    public static String reverseWords(String s) {
        List<String> words = Arrays.stream(s.trim().split(" "))
                                   .filter(each -> !each.isBlank())
                                   .collect(Collectors.toList());
        StringBuilder result = new StringBuilder();
        for (int i = words.size() - 1; i >= 0; i--) {
            result.append(words.get(i));
            result.append(" ");
        }
        return result.toString().trim();
    }

}
