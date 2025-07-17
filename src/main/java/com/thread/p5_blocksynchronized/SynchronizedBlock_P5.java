package com.thread.p5_blocksynchronized;

public class SynchronizedBlock_P5 {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        System.out.println("the starting multithreading app ....");
        System.out.println(counter.getClass().getName() + " " + "is Multithreading class!!!");
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                counter.counterFunc();
            }
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                counter.counterFunc();
            }
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                counter.counterFunc();
            }
            try {
                Thread.sleep(9000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });


        thread1.start();
        System.out.println(thread1.getName() + " " + thread1.getState());
        thread2.start();
        System.out.println(thread2.getName() + " " + thread2.getState());
        thread3.start();
        System.out.println(thread3.getName() + " " + thread3.getState());

/*

        System.out.println("thread0 is running:");
        thread1.run();
        System.out.println(thread1.getName() + " " + thread1.getState());

        System.out.println("thread1 is running:");
        thread2.run();
        System.out.println(thread2.getName() + " " + thread2.getState());

        System.out.println("thread2 is running:");
        thread3.run();
        System.out.println(thread3.getName() + " " + thread3.getState());


*/



/*

        System.out.println(" are the " + " " + thread1.getName() + " " + "is Alive?"+  " " + thread1.isAlive());;
        System.out.println(thread1.getName() + " " + thread1.getState());

        System.out.println(" are the " + " " + thread2.getName() + " " + "is Alive?"+  " " + thread2.isAlive());
        System.out.println(thread2.getName() + " " + thread2.getState());

        System.out.println(" are the " + " " + thread3.getName() + " " + "is Alive?"+  " " + thread3.isAlive());;
        System.out.println(thread3.getName() + " " + thread3.getState());

        */


/*

        System.out.println("the thread_0 is in interrupt state" + " " + thread1.getName() + " " + thread1.getState());
        thread1.interrupt();
        System.out.println(thread1.getName() + " " + thread1.getState());

        System.out.println("the thread_1  is in interrupt state" + " " + thread2.getName() + " " + thread2.getState());
        thread2.interrupt();
        System.out.println(thread2.getName() + " " + thread2.getState());

        System.out.println("the thread_2  is in interrupt state" + " " + thread3.getName() + " " + thread3.getState());
        thread3.interrupt();
        System.out.println(thread3.getName() + " " + thread3.getState());

*/





        thread1.join();
        System.out.println(thread1.getName() + " " + thread1.getState());
        thread2.join();
        System.out.println(thread2.getName() + " " + thread2.getState());
        thread3.join();
        System.out.println(thread3.getName() + " " + thread3.getState());




        System.out.println("the amount Counter is    :" + " " + counter.getCount());

    }
}
