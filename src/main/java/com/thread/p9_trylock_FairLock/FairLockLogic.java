package com.thread.p9_trylock_FairLock;

import java.util.concurrent.locks.ReentrantLock;

public class FairLockLogic {

private final ReentrantLock lock = new ReentrantLock(true);

public void accessResources(){
    lock.lock();

    try {
        System.out.println(Thread.currentThread().getName() + " " + "is accessing the resource.");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }finally {
        lock.unlock();
    }
}




}
