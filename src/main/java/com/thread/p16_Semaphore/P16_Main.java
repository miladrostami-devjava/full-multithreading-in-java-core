package com.thread.p16_Semaphore;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

public class P16_Main {

    public static void main(String[] args) {

        Semaphore barrier = new Semaphore(5);


        for (int i = 0; i < 600; i++) {
            new Thread(new ResourceUser(barrier,"User "+" " + i )).start();
        }

        System.out.println("the end...");
    }

}
