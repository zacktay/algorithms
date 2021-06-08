public class Palindrome {

    public static boolean isPalindrome(int x) {
        return ReverseInteger.reverseWithoutUsingString(x) == x;
    }

}
