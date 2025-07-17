package com.thread.p8_trylock2_SharedResource;

public class Main_P8 {

    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread thread0 = new Thread(()-> {
            for (int i = 0; i < 7; i++) {
                sharedResource.increment();
        //        System.out.println(Thread.currentThread().getName() + " " + Thread.interrupted());
                try {
                    Thread.sleep(600);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread1 = new Thread(()-> {
            for (int i = 0; i < 7; i++) {
                sharedResource.increment();
    //            System.out.println(Thread.currentThread().getName() + " " + Thread.interrupted());
                try {
                    Thread.sleep(600);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });


        thread0.start();
        thread1.start();



    }

}
