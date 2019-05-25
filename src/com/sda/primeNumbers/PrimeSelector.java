package com.sda.primeNumbers;

public class PrimeSelector {

    public boolean isPrime(int n) {
        int i;
        for (i = n - 1; i >= 2; i--) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void primesFromRange(int range) {

        int i;
        for (i = range; i >= 2; i--) {
            if (isPrime(i) == true) {
                System.out.println(i);
            }
        }
    }
}