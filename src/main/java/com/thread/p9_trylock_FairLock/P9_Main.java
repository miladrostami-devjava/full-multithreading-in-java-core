package com.thread.p9_trylock_FairLock;

public class P9_Main    {

    public static void main(String[] args) {

        FairLockLogic example = new FairLockLogic();

        Runnable task = example::accessResources;

        Thread thread1 = new Thread(task,"Thread1");
        Thread thread2 = new Thread(task,"Thread2");
        Thread thread3 = new Thread(task,"Thread3");


        thread1.start();
        thread2.start();
        thread3.start();



    }

}
