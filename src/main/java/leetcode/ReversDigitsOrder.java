package leetcode;

/*
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x
causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

 7. Reverse Integer                                                 https://www.youtube.com/watch?v=w3C4L7GxD7M
 */

public class ReversDigitsOrder {

    public static int usingString(int number) {
        var isNegative = false;

        if (number < 0) {
            isNegative = true;
            number = - number;
        }

        var string = String.valueOf(number);
        var reversedString = new StringBuilder(string).reverse().toString();

        if (isNegative) {
            reversedString = "-" + reversedString;
        }
        return Integer.valueOf(reversedString);
    }

    public static int usingNumber(int number) {
        int result = 0;

        do {
            int digit = number % 10;
            result = result * 10 + digit;
            number /= 10;
        } while (number != 0);
            return result;
    }
}
