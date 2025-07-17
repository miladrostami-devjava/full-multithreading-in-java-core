package com.thread.p5_blocksynchronized;

public class Counter {

    private Integer count = 2000;

    public Integer getCount() {
      synchronized (this){
          return count;
      }
    }

    public void counterFunc(){
     synchronized (this){
         count--;
     }
    }

}
