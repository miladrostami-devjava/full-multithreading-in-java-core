package com.thread.p3_lifecyclethreadinjava;

public class ThreadLifecycle extends Thread{

    @Override
    public void run() {
        System.out.println(getName() + " " + "is in Running State!!!");

        try {
            //timed waiting
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName() + " thread is Terminated!!!");
    }


}
