package com.thread.p12_Future;

import java.util.concurrent.*;

public class FutureExample {


    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newSingleThreadExecutor();


        Callable<String> task =
                () -> {
                    System.out.println("Single Thread created !!!");
                    TimeUnit.SECONDS.sleep(3);
                    return "Completed the task !!!!";
                };

        Future<String> future = executorService.submit(task);
        System.out.println("Waiting for task to complete...");
        System.out.println("The future is :" + " " + future.get());


        executorService.shutdown();


    }

}
