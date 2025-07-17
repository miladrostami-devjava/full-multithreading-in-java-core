package com.thread.p15_CyclicBarrier;

import java.util.concurrent.CyclicBarrier;

public class P15_Main {


    public static void main(String[] args) {

        int threadCount = 5;
        CyclicBarrier barrier = new CyclicBarrier(threadCount,()-> System.out.println("\"All threads reached the barrier. Proceeding to next phase."));


        for (int i = 0; i < threadCount; i++) {
            new Thread(new Task(barrier, "Task  " + " " + i)).start();
        }

    }

}
