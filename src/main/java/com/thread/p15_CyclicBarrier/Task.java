package com.thread.p15_CyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Task implements Runnable {

    private final CyclicBarrier barrier;
    private final String name;

    public Task(CyclicBarrier barrier, String name) {
        this.barrier = barrier;
        this.name = name;
    }


    @Override
    public void run() {

        System.out.println(" is performing its task...");
        try {
          //  Thread.sleep((long) (Math.random() * 50000));
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + "reached the barrier...");
        try {
            barrier.await();
            System.out.println(name + " " + " proceeds to the next phase.");
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }


    }


}
