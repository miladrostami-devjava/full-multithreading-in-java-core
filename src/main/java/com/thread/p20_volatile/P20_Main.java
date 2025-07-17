package com.thread.p20_volatile;

public class P20_Main {

    public static void main(String[] args) {

        VolatileExample volatileExample = new VolatileExample();
        AtomicExample atomicExample = new AtomicExample();


        System.out.println("before...");
//        new Thread(()-> {
//
//            for (int i = 0; i < 5; i++) {
//                volatileExample.increment();
//              new Thread(new VolatileExample(),"Volatile Thread-1 " + i);
//                System.out.println("increment:" + volatileExample.getCounter());
//            }
//
//        }).start();
//
//        new Thread(()-> {
//
//            for (int i = 0; i < 5; i++) {
//volatileExample.increment();
//              new Thread(new VolatileExample(),"Volatile Thread-2 " + i);
//            }
//
//        }).start();


        volatileExample.run();
        volatileExample.increment();
        System.out.println( volatileExample.getCounter());


        System.out.println("the finish");


    }

}
