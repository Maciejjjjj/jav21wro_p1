package com.sda.algorithms;

public class AlgorithmsMain {

    public static void main(String[] args) {

        Stopwatch stopwatch1 = new Stopwatch();


        int[] array1 = new int[100];
        int[] array2 = new int[10000];
        int[] array3 = new int[1000000];


        for (int i = 0; i < array1.length; i++) {
            array1[i] = i;
        }
        float avgTime1 = 0;
        for (int j = 0; j < 100; j++) {
            stopwatch1.start();
            for (int i = 0; i < array1.length; i++) {
                array1[i] = array1[i] / 2;
            }
            float time1 = stopwatch1.stop();

            avgTime1 = avgTime1 + time1;
        }

        System.out.println("Elapsed time for n=" + array1.length + ": " + avgTime1 / 100 + " miliSec");

        for (int i = 0; i < array2.length; i++) {
            array2[i] = i;
        }
        float avgTime2 = 0;
        for (int j = 0; j < 100; j++) {
            stopwatch1.start();
            for (int i = 0; i < array2.length; i++) {
                array2[i] = array2[i] / 2;
            }
            float time2 = stopwatch1.stop();
            avgTime2 = avgTime2 + time2;
        }
        System.out.println("Elapsed time for n=" + array2.length + ": " + avgTime2 / 100 + " miliSec");

        for (int i = 0; i < array3.length; i++) {
            array3[i] = i;
        }
        float avgTime3 = 0;
        for (int j = 0; j < 100; j++) {
            stopwatch1.start();
            for (int i = 0; i < array3.length; i++) {
                array3[i] = array3[i] / 2;
            }
            float time3 = stopwatch1.stop();
            avgTime3 = avgTime3 + time3;
        }

        System.out.println("Elapsed time for n=" + array3.length + ": " + avgTime3 / 100 + " miliSec");

    }


}
