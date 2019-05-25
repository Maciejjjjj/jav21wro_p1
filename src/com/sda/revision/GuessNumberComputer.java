package com.sda.revision;

import java.util.Scanner;

public class GuessNumberComputer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to guess (from range 0-99):");
        int numberToGuess = scanner.nextInt();
        double computerNumber = 50;
        int i = 0;
        while (i < 6) {
            double temp = computerNumber;
            if (temp < numberToGuess) {
                i++;
                computerNumber = temp + (50 / Math.pow(2, i));
            }
            if (temp > numberToGuess) {
                i++;
                computerNumber = temp - (50 / Math.pow(2, i));
            }
            if ( (int) computerNumber == numberToGuess) {
                System.out.println("Your number is: " + (int) computerNumber);
                break;
            }
            if (i == 6) {
                System.out.println("Computer can not guess your number");
            }

        }
    }
}
