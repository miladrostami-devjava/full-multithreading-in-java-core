package com.thread.p13_newCachedThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewCachedThreadPoolExample {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newCachedThreadPool();

        Runnable task1 = ()-> System.out.println(Thread.currentThread().getName() + " task 1 is running");
        Runnable task2 = ()-> System.out.println(Thread.currentThread().getName() + " task 2 is running");
        Runnable task3 = ()-> System.out.println(Thread.currentThread().getName() + " task 3 is running");
        Runnable task4 = ()-> System.out.println(Thread.currentThread().getName() + " task 4 is running");
        Runnable task5 = ()-> System.out.println(Thread.currentThread().getName() + " task 5 is running");


        executorService.submit(task1);
        executorService.submit(task2);
        executorService.submit(task3);
        executorService.submit(task4);
        executorService.submit(task5);
        executorService.shutdown();


    }


}
