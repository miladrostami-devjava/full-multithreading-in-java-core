package com.thread.p14_CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class Worker implements Runnable{

    private final CountDownLatch latch;
    private final String name;

    public Worker(CountDownLatch latch, String name) {
        this.latch = latch;
        this.name = name;
    }

    @Override
    public void run() {

        //original business logic implementation
        System.out.println(name + " " + "is working...");

        try {
            Thread.sleep((long) (Math.random()*10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("the Worker (threads) the finished!!!!======>>>>>"+name);

        latch.countDown();

    }
}
