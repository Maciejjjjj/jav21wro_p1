package com.sda.algorithms;

public class Stopwatch {

    long startTime = 0;


    public void start() {
        this.startTime = System.nanoTime();
    }


    public float stop() {

        return (System.nanoTime() - startTime)/1000000f;
    }


}
