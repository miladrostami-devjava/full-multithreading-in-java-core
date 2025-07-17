package com.thread.p8_trylock2_SharedResource;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {


    private final ReentrantLock lock = new ReentrantLock();
    private int count;

    public void increment(){

        try {
            if (lock.tryLock()){
                try {
                    count++;
                    System.out.println(Thread.currentThread().getName() + " incremented count to " + " " + count);
                }finally {
                    lock.unlock();
                }
            }else {
                System.out.println(Thread.currentThread().getName() + " " + " could not acquire lock.");
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
