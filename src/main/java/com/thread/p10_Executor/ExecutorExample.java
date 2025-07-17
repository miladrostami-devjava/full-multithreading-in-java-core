package com.thread.p10_Executor;

import java.util.concurrent.Executor;

public class ExecutorExample {


    public static void main(String[] args) {

        Executor executor = new Executor() {
            @Override
            public void execute(Runnable command) {
                new Thread(command).start();
                System.out.println(Thread.currentThread().getName() + "this thread is calling for task done");
            }
        };


        Runnable task = new Runnable() {
            @Override
            public void run() {
                new Thread(() -> {
                    System.out.println("Task is running in thread: " + " " + Thread.currentThread().getName());
                });
            }
        };

    /*    Runnable task = ()-> {
            System.out.println("Task is running in thread: " + " " + Thread.currentThread().getName());
        };*/

/*        Runnable task = ()->
            System.out.println("Task is running in thread: " + " " + Thread.currentThread().getName());*/

executor.execute(task);

    }


}
