package com.thread.p6_Deadlock;

public class Resource {


    public void processA(){

      synchronized (this){
          System.out.println(Thread.currentThread().getName() + " " + " is executing ProcessA");
          try {
              Thread.sleep(2000);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
      }
    }

    public void processB(){

synchronized (this){
    System.out.println(Thread.currentThread().getName() + " " + " is executing ProcessB");
    try {
        Thread.sleep(9000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

}
    }

}
