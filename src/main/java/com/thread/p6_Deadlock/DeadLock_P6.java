package com.thread.p6_Deadlock;

public class DeadLock_P6 {

    public static void main(String[] args) throws InterruptedException {

        Resource resource1  = new Resource();
        Resource resource2  = new Resource();
        Resource resource3  = new Resource();
        Resource resource4  = new Resource();


        Thread thread1 = new Thread(()->{

            synchronized (resource1){
                System.out.println("thread 1 locked resource1");
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (resource2){
                System.out.println("thread 1 locked resource2");

            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (resource3){
                System.out.println("thread 1 locked resource3");
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (resource4){
                System.out.println("thread 1 locked resource4");

            }

        });

        Thread thread2 = new Thread(()-> {

            synchronized (resource4){
                System.out.println("thread 2 locked resource4");
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            synchronized (resource3){
                System.out.println("thread 2 locked resource3");
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


           synchronized (resource2){
                System.out.println("thread 2 locked resource2");
           }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
           synchronized (resource1){
                System.out.println("thread 2 locked resource1");
           }
        });




        Thread thread3 = new Thread(()-> {

            synchronized (resource3){
                System.out.println("thread 3 locked resource3");
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            synchronized (resource4){
                System.out.println("thread 3 locked resource4");
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


            synchronized (resource1){
                System.out.println("thread 3 locked resource1");
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (resource2){
                System.out.println("thread 3 locked resource2");
            }
        });



        thread1.start();
        thread2.start();
        thread3.start();



        thread1.join();
        thread2.join();
        thread3.join();


    }


}
