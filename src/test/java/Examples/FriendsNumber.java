package Examples;

import java.util.stream.IntStream;

public class FriendsNumber {
    public static void main(String[] args) {
        // Amicable numbers are two different natural numbers related in such a way that the sum of the proper divisors of each is equal to the other number.

        int number1 = 220;
        int number2 = 284;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 1; i*2 <= number1; i++) {
            if (number1 % i == 0) {
                sum1 += i;
            }
        }
        for (int i = 1; i*2 <= number2; i++) {
            if (number2 % i == 0) {
                sum2 += i;
            }
        }
        System.out.println("Number " + number1 + " and " + number2 + " are " + (sum1 == number2 && sum2 == number1? "amicable" : "not amicable") + " numbers");
    }
}
