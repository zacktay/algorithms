public class PowerOfThree {

    public static boolean isPowerOfThree(int n) {
        // Keep dividing by 3
        while (n > 1 && n % 3 == 0) {
            n = n / 3;
        }
        // Check if end result is 1 (fully divisible)
        return n == 1;
    }

}
