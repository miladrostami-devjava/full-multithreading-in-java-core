package com.thread.p3_lifecyclethreadinjava;

public class ThreadLicecycle_P3 {


    public static void main(String[] args) {
        ThreadLifecycle threadLifecycle = new ThreadLifecycle();
        System.out.println("the state thread is :" + threadLifecycle.getState() );
        threadLifecycle.start();
        System.out.println("After thread start(): "+ " " + threadLifecycle.getState());
        try {
            Thread.sleep(4000);
        System.out.println("Thread state during sleep  :" + threadLifecycle.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            threadLifecycle.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread state after termination:  :"  + threadLifecycle.getState());
    }

}
