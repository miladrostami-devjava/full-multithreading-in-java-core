package com.thread.p24_ForkJoinFramework.state2_RecursiveAction;

import java.util.concurrent.ForkJoinPool;

public class Main_RecursiveAction {
    public static void main(String[] args) {
        int[] array  ={4,5,6,-9,-3,45,45};


        ForkJoinPool pool = new ForkJoinPool();
        MergeSortTask mergeSortTask = new MergeSortTask(array,0,array.length);


        pool.invoke(mergeSortTask);

        System.out.println("Sorted Array :");
        for (int value : array){
            System.out.println(value + " ");
        }
    }
}
