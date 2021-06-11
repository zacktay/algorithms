import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {
        int count = 0;
        char[] charArray = s.trim().toCharArray();
        for (char c : charArray) {
            count++;
            if (c == ' ') {
                count = 0;
            }
        }
        return count;
    }

    public static int lengthOfLastWordUsingStream(String s) {
        List<String> split = Arrays.stream(s.trim().split(" "))
                                   .collect(Collectors.toList());

        return split.stream()
                    .skip(split.size() - 1)
                    .findFirst()
                    .map(String::length)
                    .orElse(0);
    }

}
