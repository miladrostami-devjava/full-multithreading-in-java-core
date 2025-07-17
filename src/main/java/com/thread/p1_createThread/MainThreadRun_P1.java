package com.thread.p1_createThread;

public class MainThreadRun_P1 {


    public static void main(String[] args) {

MyThreadDemo task1 = new MyThreadDemo("Thread 1");
MyThreadDemo task2 = new MyThreadDemo("Thread 2");
MyThreadDemo task3 = new MyThreadDemo("Thread 3");



task1.start();
task2.start();
task3.start();
//task1.start();
//task2.start();



    }

}
