package com.sda.bubbleSort;

import java.util.Random;

public class BubbleSortMain {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();

        for (int i =0; i < array.length; i++){
            array[i] = (random.nextInt(26)-5);
        }
        for (int number : array) {
            System.out.print(number + "|");
        }
        int[] sortedArray = sort(array);
        System.out.println();
        System.out.println("Your sorted array:");
        for (int number : sortedArray) {
            System.out.print(number + "|");
        }

    }

    private static int[] sort(int[] array){

        int[] sortedArray = array;


        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;

            for (int i = 0; i < sortedArray.length-1; i++) {
                if (sortedArray[i] > sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }

        }
        return sortedArray;
    }


}
