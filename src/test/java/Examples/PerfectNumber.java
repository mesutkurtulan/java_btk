package Examples;

import java.util.stream.IntStream;

public class PerfectNumber {
    public static void main(String[] args) {
        // Perfect Number: A number is perfect if it is equal to the sum of its positive divisors, excluding itself.

        int number = 28;
        int sum = 0;
        for (int i = 1; i*2 <= number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        System.out.println("Number " + number + " is " + (sum == number ? "perfect" : "not perfect") + " number");

        // IntStream
        sum = IntStream.rangeClosed(1, number/2).filter(i -> number % i == 0).sum();
        System.out.println("Number " + number + " is " + (sum == number ? "perfect" : "not perfect") + " number");
    }
}
