package com.sda.primeNumbers;

import java.util.Scanner;

public class PrimeNumbersMain {

    public static void main(String[] args) {
        PrimeSelector isPrime = new PrimeSelector();
        Scanner scanner = new Scanner(System.in);

        System.out.println("If your number is prime? " + isPrime.isPrime(47));

        System.out.println("Enter your range:");
        int range = scanner.nextInt();
        System.out.println("Primes from your range:");
        isPrime.primesFromRange(range);
    }
}
