package com.sda.largestFactor;

public class LargestFactorRecurrence {

    static int factor = 0;
    static int largestFactor = 0;

    public int largestFactorSeeker(int number1, int number2) {
        factor++;
        if (number1 % factor == 0 && number2 % factor == 0) {
            largestFactor = factor;
        }

        if (factor < number2 && factor < number1) {

            return largestFactorSeeker(number1, number2);

        } else {

            return largestFactor;

        }
    }


}
