package com.thread.p14_CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class P14_Main {

    public static void main(String[] args) throws InterruptedException {

        int threadCount = 2;
        CountDownLatch latch = new CountDownLatch(threadCount);


        for (int i = 0; i < threadCount; i++) {
            new Thread(new Worker(latch, "Worker" + " " + i)).start();
        }
        System.out.println("\"Waiting for all workers to finish...");
        latch.await();

        System.out.println("All workers finished. Proceeding with main thread.");

    }

}
