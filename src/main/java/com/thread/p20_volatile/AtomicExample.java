package com.thread.p20_volatile;

import java.util.concurrent.atomic.AtomicInteger;
//Race condition not allow
public class AtomicExample implements Runnable{
private AtomicInteger counter = new AtomicInteger(0);

public void increment(){
    counter.incrementAndGet();
}

    public AtomicInteger getCounter() {
        return counter;
    }

    @Override
    public void run() {
        System.out.println("from AtomicExample running ...");

        increment();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("from AtomicExample the ended...");


    }
}
