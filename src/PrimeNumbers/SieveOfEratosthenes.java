package PrimeNumbers;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SieveOfEratosthenes {

    public static List<Integer> generatePrime(Integer num) {
        LocalDateTime start = LocalDateTime.now();

        if (Objects.nonNull(num)) {
            if (num == 2) {
                return Collections.singletonList(2);
            } else if (num > 2) {
                // Initialises lookup array
                boolean[] map = new boolean[num + 1];
                Arrays.fill(map, true);

                int limit = Double.valueOf(Math.sqrt(num)).intValue();
                for (int index = 2; index <= limit; index++) {
                    if (map[index]) {
                        for (int multiple = index * index; multiple <= num; multiple += index) {
                            map[multiple] = false;
                        }
                    }
                }

                List<Integer> result = IntStream.range(2, map.length)
                                                .boxed()
                                                .filter(each -> map[each])
                                                .collect(Collectors.toList());

                System.out.printf("[Sieve] Completed generation of prime up till %s, Took %s ms, %s primes found%n",
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
