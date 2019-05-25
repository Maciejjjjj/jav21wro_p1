package com.sda.revision;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(100);
        boolean flag = true;
        int userNumber;
        while (flag) {
            System.out.println("Guess number:");
            userNumber = scanner.nextInt();

            if (userNumber < numberToGuess){
                System.out.println("Your number is lower than number to guess.");
            }
            if (userNumber > numberToGuess){
                System.out.println("Your number is higher than number to guess.");
            }
            if (userNumber == numberToGuess){
                System.out.println("Congratulation you guessed the number!!!");
                flag = false;
            }

        }


    }
}
