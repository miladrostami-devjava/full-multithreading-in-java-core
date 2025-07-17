package com.thread.p7_tryLock_ReentrantLock;

public class Msin_P7 {

    public static void main(String[] args) {

        DeadLockPrevention deadLockPrevention1 = new DeadLockPrevention();
        DeadLockPrevention deadLockPrevention2 = new DeadLockPrevention();

        Thread thread1 = new Thread(deadLockPrevention1::methodA);
        Thread thread2 = new Thread(deadLockPrevention2::methodB);

        thread1.start();
        thread2.start();


    }
}
