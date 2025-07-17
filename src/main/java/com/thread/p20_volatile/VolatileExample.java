package com.thread.p20_volatile;


//Race condition can allow
public class VolatileExample implements Runnable {


    private volatile  Integer counter = 0;

    public void increment(){
counter ++;
    }

    public Integer getCounter() {
        return counter;
    }


    @Override
    public void run() {
        System.out.println(" from VolatileExample  running ...");
        try {
            Thread.sleep(4000);
            System.out.println(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
increment();

        System.out.println("from VolatileExample  the ended...");


    }
}
