import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {

    public List<String> fizzBuzz(int n) {
        return IntStream.rangeClosed(1, n)
                        .boxed()
                        .map(each -> {
                            String result = "";
                            if (each % 3 == 0) {
                                result += "Fizz";
                            }
                            if (each % 5 == 0) {
                                result += "Buzz";
                            }

                            return result.isEmpty() ? each.toString() : result;
                        })
                        .collect(Collectors.toList());
    }

}
