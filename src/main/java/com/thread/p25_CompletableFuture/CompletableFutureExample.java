package com.thread.p25_CompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample {


    public static void main(String[] args) {


        System.out.println("--------------------------------------------------Space------------------------------------------------------------");
        System.out.println("--------------------------------------------------Space------------------------------------------------------------");
        System.out.println("--------------------------------------------------Space------------------------------------------------------------");
        System.out.println("--------------------------------------------------Space------------------------------------------------------------");
        System.out.println("--------------------------------------------------Space------------------------------------------------------------");
        System.out.println("--------------------------------------------------Space------------------------------------------------------------");


        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> 5)
                .thenApply((result) -> result * 5)
                .thenApply((result) -> result * 80)
                .copy();


        System.out.println("the result :");
        future.thenAccept(System.out::println);
        System.out.println(future);
        System.out.println(future.isDone());
        System.out.println(future.join());
        System.out.println(future.toCompletableFuture());
        System.out.println(future.defaultExecutor());
        System.out.println(future.isCancelled());


        System.out.println("--------------------------------------------------Space------------------------------------------------------------");
        System.out.println("--------------------------------------------------Space------------------------------------------------------------");
        System.out.println("--------------------------------------------------Space------------------------------------------------------------");
        System.out.println("--------------------------------------------------Space------------------------------------------------------------");
        System.out.println("--------------------------------------------------Space------------------------------------------------------------");
        System.out.println("--------------------------------------------------Space------------------------------------------------------------");

        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> 3);
        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> 30);
        CompletableFuture<Integer> future3 = CompletableFuture.supplyAsync(() -> 3540);
        CompletableFuture<Integer> future4 = CompletableFuture.supplyAsync(() -> 330);
        CompletableFuture<Integer> future5 = CompletableFuture.supplyAsync(() -> 301);

        CompletableFuture<Void> allOfFuture = CompletableFuture.allOf(future1, future2, future3, future4, future5);


        allOfFuture.thenRun(() -> {

            try {
                System.out.println(
                        "the future 1 " + " " + future1.get() + " " +
                                "the future 2 " + " " + future2.get() + " " +
                                "the future 3 " + " " + future3.get() + " " +
                                "the future 4 " + " " + future4.get() + " " +
                                "the future 5 " + " " + future5.get()


                );
                System.out.println(future1.get() + future2.get() + future3.get() + future4.get() + future5.get());

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }

        });


        System.out.println("--------------------------------------------------Space------------------------------------------------------------");
        System.out.println("--------------------------------------------------Space------------------------------------------------------------");
        System.out.println("--------------------------------------------------Space------------------------------------------------------------");
        System.out.println("--------------------------------------------------Space------------------------------------------------------------");
        System.out.println("--------------------------------------------------Space------------------------------------------------------------");
        System.out.println("--------------------------------------------------Space------------------------------------------------------------");


        CompletableFuture<Object> anyOfFuture = CompletableFuture.anyOf(future1, future2, future3, future4, future5);

        anyOfFuture.thenRun(
                () -> {
                    try {
                        System.out.println(future1.get());
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    } catch (ExecutionException e) {
                        throw new RuntimeException(e);
                    }
                }
        );


        System.out.println("--------------------------------------------------Space------------------------------------------------------------");
        System.out.println("--------------------------------------------------Space------------------------------------------------------------");
        System.out.println("--------------------------------------------------Space------------------------------------------------------------");
        System.out.println("--------------------------------------------------Space------------------------------------------------------------");
        System.out.println("--------------------------------------------------Space------------------------------------------------------------");
        System.out.println("--------------------------------------------------Space------------------------------------------------------------");


        CompletableFuture<Integer> futureForExceptionally = CompletableFuture.supplyAsync(() -> {
            if (true) try {
                throw new Exception("the problem is in system.");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            return 45;
        });

        futureForExceptionally.exceptionally((throwable -> {
            System.out.println("this is a problem,Please resolve" + " " + throwable.getMessage());
            System.out.println("this is a problem,Please resolve" + " " + throwable.getLocalizedMessage());
            System.out.println("this is a problem,Please resolve" + " " + throwable.getCause());
            System.out.println("this is a problem,Please resolve" + " " + throwable.toString());
            System.out.println("this is a problem,Please resolve" + " " + throwable.hashCode());
            System.out.println("this is a problem,Please resolve" + " " + throwable.getSuppressed());
            System.out.println("this is a problem,Please resolve" + " " + throwable.getClass());

            return -1;
        })).thenAccept(System.out::println);


        System.out.println("--------------------------------------------------Space------------------------------------------------------------");
        System.out.println("--------------------------------------------------Space------------------------------------------------------------");
        System.out.println("--------------------------------------------------Space------------------------------------------------------------");
        System.out.println("--------------------------------------------------Space------------------------------------------------------------");
        System.out.println("--------------------------------------------------Space------------------------------------------------------------");
        System.out.println("--------------------------------------------------Space------------------------------------------------------------");


        CompletableFuture<Integer> futureHandle = CompletableFuture.supplyAsync(
                () -> {
                    if (true) {
                        try {
                            throw new Exception("this is a problem");
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                    }
                    return 435;
                }
        );

        futureHandle.handle((result, ex) -> {
            if (ex != null) {
                try {
                    System.out.println("the error!!" + " " + ex.getMessage());
                    return -1;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            return result;
        }).thenAccept(System.out::println);


    }


}
