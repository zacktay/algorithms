public class ClimbingStairs {

    public static int solution(int n) {
        int[] cached = new int[n + 1];
        cached[0] = 1;
        cached[1] = 1;

        return calculate(n, cached);
    }

    public static int calculate(int n, int[] cached) {
        // if result is alr cached, return from cache
        if (cached[n] > 0) {
            return cached[n];
        }

        // Compute
        int numSteps = calculate(n - 1, cached) + calculate(n - 2, cached);
        cached[n] = numSteps;

        return numSteps;
    }

}
