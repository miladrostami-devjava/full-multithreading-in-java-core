package com.thread.p22_volatile_vs_synchronized;

public class VolatileExample {

    private volatile int counter = 0;

    public void increment(){
        counter++;
    }

    public int getCounter() {
        return counter;
    }
}
