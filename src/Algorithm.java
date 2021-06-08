import PrimeNumbers.BruteForce;
import PrimeNumbers.SieveOfEratosthenes;

import java.util.Arrays;
import java.util.List;

public class Algorithm {

    private static final Integer LIMIT = 1000000;

    public static void main(String[] args) {
//        List<Integer> sievePrimes = SieveOfEratosthenes.generatePrime(LIMIT);
//        List<Integer> bruteForcePrimes = BruteForce.generatePrime(LIMIT);
//
//        int[] numbers = new int[]{2, 7, 11, 15, 3, 2, 4, 13, 17, 21};
//        int[] twoSum = TwoSum.compute(numbers, 34);
//
//        List<Integer> numbersToReverse = Arrays.asList(12121, 123456, 121, 111, 123);
//        numbersToReverse.forEach(number -> {
//            Integer reversed = ReverseInteger.reverseWithoutUsingString(number);
//            System.out.printf("Reversed %s, Result %s%n", number, reversed);
//        });
//        numbersToReverse.forEach(number -> {
//            Boolean isPalindrome = Palindrome.isPalindrome(number);
//            System.out.printf("Is Palindrome %s - %s%n", number, isPalindrome);
//        });
//
//        int[] arrayToRotate = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
//        int shiftBy = 3;
//        System.out.printf("Array to rotate - %s. Shift Left by %s. Result - %s%n",
//                          Arrays.toString(arrayToRotate),
//                          shiftBy, Arrays.toString(ArrayRotation.rotateLeft(arrayToRotate, shiftBy)));
//        System.out.printf("Array to rotate - %s. Shift Right by %s. Result - %s%n",
//                          Arrays.toString(arrayToRotate),
//                          shiftBy, Arrays.toString(ArrayRotation.rotateRight(arrayToRotate, shiftBy)));

        int[] coins = new int[]{1, 2, 5};
        int change = 12578;
        int result = CoinChange.calculateLeastAmountOfCoins(coins, change);
        System.out.printf("Number of coins required to return %s - %s", change, result);
    }

}
