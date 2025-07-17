package com.thread.p7_tryLock_ReentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockPrevention {

    private final Lock lock1 = new ReentrantLock();
    private final Lock lock2 = new ReentrantLock();

    public void methodA() {
        try {
            if (lock1.tryLock() && lock2.tryLock()) {
                try {
                    System.out.println(Thread.currentThread().getName() + " " + "executing method A");
                } finally {
                    lock1.unlock();
                    lock2.unlock();
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " " + " could not acquire locks for\n" +
                        "methodA");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void methodB() {
        try {
            if (lock2.tryLock() && lock1.tryLock()) {
                try {
                    System.out.println(Thread.currentThread().getName() + " " + "executing method B");
                } finally {
                    lock2.unlock();
                    lock1.unlock();
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " " + " could not acquire locks for\n" +
                        "methodB");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
