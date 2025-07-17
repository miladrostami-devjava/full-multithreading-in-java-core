package com.thread.p1_createThread;

public class MyThreadDemo extends Thread    {

    private String threadName;

    public MyThreadDemo(String threadName){
        this.threadName = threadName;
    }


    @Override
    public void run() {

        for (int i = 0; i <= 10 ; i++) {

            System.out.println(threadName + " is Running in Step :" + i);

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("error !!! .... Please check Thread code");
                e.printStackTrace();
            }



        }


        System.out.println(  threadName + " " +   "Running Thread Finish!!!");

    }
}
