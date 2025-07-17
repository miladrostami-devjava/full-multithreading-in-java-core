package com.thread.p4_racecondition_synchronize.withoutsynchronize;

public class RaceCondition_WithoutSynchronization {

    public static void main(String[] args) {

        MultiplyCal multiplyCal = new MultiplyCal();

        Thread thread1 = new Thread(()-> {
           int i =0;
           while (i < 2000){
               multiplyCal.multiply();
               i++;
               System.out.println("thread1 is in step  ::::" + i);
           }
        });


        Thread thread2 = new Thread(()-> {
            int i =0;
            while (i < 2000){
                multiplyCal.multiply();
                i++;
                System.out.println("thread2 is in step  ::::" + i);
            }
        });


        thread1.start();
        System.out.println(thread1.getName() + " " + " is in state  ::" + " " + thread1.getState());
        thread2.start();
        System.out.println(thread2.getName() + " " + " is in state  ::" + " " + thread2.getState());


        try {
            thread1.join();
        } catch (InterruptedException e) {
            System.out.println(thread1.getName()+" "+ " have error of  :::" + e.getMessage());
        }
        System.out.println(thread1.getName() + " " + " is in state  ::" + " " + thread1.getState());


        try {
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println(thread2.getName()+" "+ " have error of  :::" + e.getMessage());
        }
        System.out.println(thread2.getName() + " " + " is in state  ::" + " " + thread2.getState());


        System.out.println("Finish multiply calculate with amount  :::" + " " + multiplyCal.multiply());

    }



}
