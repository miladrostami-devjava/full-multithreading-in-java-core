package com.thread.p24_ForkJoinFramework.state1_RecursiveTask;

import java.util.concurrent.ForkJoinPool;

public class Main_RecursiveTask {
    public static void main(String[] args) {


        int[] array = new int[70];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        ForkJoinPool pool = new ForkJoinPool();
        SumTask sumTask = new SumTask(array,0,array.length);

        int result = pool.invoke(sumTask);
        System.out.println("The result :" + result);

    }
}
