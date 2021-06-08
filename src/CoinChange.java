import java.util.Arrays;

public class CoinChange {

    public static int calculateLeastAmountOfCoins(int[] coins, int amount) {
        int[] result = new int[amount + 1];
        Arrays.sort(coins);
        Arrays.fill(result, amount + 1);
        result[0] = 0;

        for (int i = 0; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    result[i] = Math.min(result[i], 1 + result[i - coin]);
                } else {
                    break;
                }
            }
        }

        return result[amount] < amount + 1 ? result[amount] : -1;
    }

}
