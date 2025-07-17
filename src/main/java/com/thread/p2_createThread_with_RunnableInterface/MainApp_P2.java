package com.thread.p2_createThread_with_RunnableInterface;

public class MainApp_P2 {

    public static void main(String[] args) {

        Thread thread1 = new Thread(new RunnableTask("thread1"));
        Thread thread2 = new Thread(new RunnableTask("thread2"));

        thread1.start();
        thread2.start();

    }

}
