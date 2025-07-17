package com.thread.p22_volatile_vs_synchronized;

public class SynchronizedExample {
private  int counter = 1;

public synchronized void increment(){
    counter++;
}

    public int getCounter() {
        return counter;
    }
}
