package com.sda.largestFactor;

import java.util.Scanner;

public class LargestFactorMain {

    public static void main(String[] args) {
        LargestFactorIterable factorSeekerIterable = new LargestFactorIterable();
        LargestFactorRecurrence factorSeekerRecurrence = new LargestFactorRecurrence();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        int number1 =scanner.nextInt();
        System.out.println("Enter second number:");
        int number2 =scanner.nextInt();

        System.out.println("Largest factor of your numbers is: " + factorSeekerIterable.largestFactorSeeker(number1, number2));
        System.out.println("********************");
        System.out.println("Largest factor of your numbers is: " + factorSeekerRecurrence.largestFactorSeeker(number1, number2));
    }


}
