import java.math.BigInteger;

public class BinaryOperation {

    public int solution(String S) {
        BigInteger number = new BigInteger(S, 2);
        int count = 0;

        BigInteger two = new BigInteger("2");
        while (number.compareTo(BigInteger.ZERO) != 0) {
            number = number.mod(two).equals(BigInteger.ZERO) ? number.divide(two) : number.subtract(BigInteger.ONE);
            count++;
        }

        return count;
    }

}
