package Examples;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.IntStream;

public class PrimeNumber {
    public static void main(String[] args) {
        // Find Prime Number with Simple Divide Method
        int number = 1;
        Boolean isPrime = false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = true;
            }
        }
        if (isPrime || number == 1) {
            System.out.println("Number " + number + " is not Prime");
        } else {
            System.out.println("Number " + number + " is Prime");
        }

        // Find Prime Number with Square Root Method
        for (int i = 2; i <= number / 2; i++) { // or Math.sqrt(number)
            if (number % i == 0) {
                isPrime = true;
            }
        }
        if (isPrime || number == 1) {
            System.out.println("Number " + number + " is not Prime");
        } else {
            System.out.println("Number " + number + " is Prime");
        }

        // Find Prime Number with Sieve of Eratosthenes Method
        boolean[] prime = new boolean[number + 1];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;

        for (int i = 2; i * i <= number; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= number; j += i) {
                    prime[j] = false;
                }
            }
        }

        if (prime[number]) {
            System.out.println("Number " + number + " is Prime");
        } else {
            System.out.println("Number " + number + " is not Prime");
        }

        // Find Prime Number with Stream
        if (IntStream.rangeClosed(2, (int) Math.sqrt(number)).anyMatch(i -> number % i == 0) || number == 1) {
            System.out.println("Number " + number + " is not Prime");
        } else {
            System.out.println("Number " + number + " is Prime");
        }

        // Find Prime Number with BigInteger
        if (BigInteger.valueOf(number).isProbablePrime(1)) {
            System.out.println("Number " + number + " is Prime");
        } else {
            System.out.println("Number " + number + " is not Prime");
        }
    }
}
