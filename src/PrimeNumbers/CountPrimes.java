package PrimeNumbers;

public class CountPrimes {

    public static int countPrimes(int n) {
        return SieveOfEratosthenes.generatePrime(n).size();
    }

}
