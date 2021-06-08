import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseInteger {

    public static int reverseUsingString(int x) {
        try {
            String intString = Arrays.stream(Integer.toString(x).split(""))
                                     .filter(each -> !each.equalsIgnoreCase("-"))
                                     .collect(Collectors.joining());
            int result = Integer.parseInt(new StringBuilder(intString).reverse().toString());

            return x > 0 ? result : -result;
        } catch (Exception e) {
            return 0;
        }
    }

    public static int reverseWithoutUsingString(int x) {
        int originalNumber = x;
        int reversed = 0;
        while (x > 0) {
            // Multiply reversed number by 10, add remainder of division of actual number by 10
            reversed = (reversed * 10) + (x % 10);

            // Divide original number by 10
            x = x / 10;
        }

        return reversed;
    }

}
