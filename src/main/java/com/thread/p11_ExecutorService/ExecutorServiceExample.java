package com.thread.p11_ExecutorService;

import java.util.concurrent.*;

public class ExecutorServiceExample {


    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(3);


        Callable<Integer> task1 = ()-> {
            System.out.println("Task 1 is running in thread: " + " " + Thread.currentThread().getName());
            return 1;
        };

        Callable<Integer> task2 = ()-> {
            System.out.println("Task 2 is running in thread: " + Thread.currentThread().getName());
            return 61;
        };
        Callable<Integer> task3 = ()-> {
            System.out.println("Task 3 is running in thread: " + Thread.currentThread().getName());
            return 98;
        };

        Future<Integer> future1 = executorService.submit(task1);
        Future<Integer> future2 = executorService.submit(task2);
        Future<Integer> future3 = executorService.submit(task3);


        System.out.println("the future 1 for task 1 is :" + future1.get());
        System.out.println("the future 2 for task 2 is :" + future2.get() );
        System.out.println("the future 3 for task 3 is :" + future3.get() );


        executorService.shutdown();








    }




}
