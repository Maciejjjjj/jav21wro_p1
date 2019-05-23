package com.sda.largestFactor;

public class LargestFactorIterable {

    public int largestFactorSeeker(int number1, int number2) {

        int largestFactor = 0;
        int factor = 0;


            while (factor < number2 && factor < number1) {
                factor++;
                if (number1 % factor == 0 && number2 % factor == 0) {
                    largestFactor = factor;
                }
            }

        return largestFactor;
    }



}
