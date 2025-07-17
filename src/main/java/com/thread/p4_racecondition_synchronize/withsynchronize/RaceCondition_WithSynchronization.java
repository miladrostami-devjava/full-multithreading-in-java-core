package com.thread.p4_racecondition_synchronize.withsynchronize;

import com.thread.p4_racecondition_synchronize.withoutsynchronize.MultiplyCal;

public class RaceCondition_WithSynchronization {


    public static void main(String[] args) {

        MultiplyCalSynchronized multiplyCal = new MultiplyCalSynchronized();

        Thread thread1 = new Thread(() -> {
            int i = 0;
            while (i < 2000) {
                multiplyCal.multiply();
                i++;
                System.out.println("thread1 is in step  ::::" + i);
            }
        });


        Thread thread2 = new Thread(() -> {
            int i = 0;
            while (i < 2000) {
                multiplyCal.multiply();
                i++;
                System.out.println("thread2 is in step  ::::" + i);
            }
        });


        Thread thread3 = new Thread(() -> {
            int i = 0;
            while (i < 2000) {
                multiplyCal.multiply();
                i++;
                System.out.println("thread3 is in step  ::::" + i);
            }
        });


        /*Runnable thread3 = new Runnable() {
            @Override
            public void run() {
                multiplyCal.multiply();

                Thread thread3 = new Thread();
                thread3.start();
                try {
                    thread3.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };*/

        thread1.start();
        System.out.println(thread1.getName() + " " + " is in state  ::" + " " + thread1.getState());
        thread2.start();
        System.out.println(thread2.getName() + " " + " is in state  ::" + " " + thread2.getState());
        thread3.start();
        System.out.println(thread3.getName() + " " + " is in state  ::" + " " + thread3.getState());

        try {
            thread1.join();
        } catch (InterruptedException e) {
            System.out.println(thread1.getName() + " " + " have error of  :::" + e.getMessage());
        }
        System.out.println(thread1.getName() + " " + " is in state  ::" + " " + thread1.getState());


        try {
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println(thread2.getName() + " " + " have error of  :::" + e.getMessage());
        }
        System.out.println(thread2.getName() + " " + " is in state  ::" + " " + thread2.getState());



        try {
            thread3.join();
        } catch (InterruptedException e) {
            System.out.println(thread3.getName() + " " + " have error of  :::" + e.getMessage());
        }
        System.out.println(thread3.getName() + " " + " is in state  ::" + " " + thread3.getState());


        System.out.println("Finish multiply calculate with amount  :::" + " " + multiplyCal.multiply());




    }


}
