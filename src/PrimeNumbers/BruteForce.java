package PrimeNumbers;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BruteForce {

    public static boolean isPrime(Integer number) {
        if (number== 2) {
            return true;
        }
        int limit = Double.valueOf(Math.sqrt(number)).intValue();
        for (int i = 2; i <= limit; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> generatePrime(Integer num) {
        LocalDateTime start = LocalDateTime.now();

        if (Objects.nonNull(num)) {
            if (num == 2) {
                return Collections.singletonList(2);
            } else if (num > 2) {
                List<Integer> result = IntStream.rangeClosed(2, num)
                                                .boxed()
                                                .filter(BruteForce::isPrime)
                                                .collect(Collectors.toList());

                System.out.printf("[BruteForce] Completed generation of prime up till %s, Took %s ms, %s primes found%n",
                                  num,
                                  ChronoUnit.MILLIS.between(start, LocalDateTime.now()),
                                  result.size());
                return result;
            }
            return Collections.emptyList();
        }
        return Collections.emptyList();
    }

}
