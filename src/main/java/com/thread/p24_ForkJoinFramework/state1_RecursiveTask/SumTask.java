package com.thread.p24_ForkJoinFramework.state1_RecursiveTask;

import java.util.concurrent.RecursiveTask;

public class SumTask extends RecursiveTask<Integer> {

    private final int[] array;
    private final int start;
    private final int end;
    private final int THRESHOLD = 10;

    public SumTask(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }


    @Override
    protected Integer compute() {

        if (end - start <= THRESHOLD) {
            //Small task: direct calculation
            int sum = 0;
            for (int i = start; i < end; i++) {
                sum +=  array[i];
            }
            return sum;
        } else {
            //division task
            int mid = (start + end) / 2;
            SumTask leftTask = new SumTask(array, start, mid);
            SumTask rightTask = new SumTask(array, mid, end);

            //  We execute subtasks: Fork
            leftTask.fork();
            rightTask.fork();
            // We combine the results: Join
            int LeftTask = leftTask.join();
            int RightTask = rightTask.join();

            return LeftTask + RightTask;


        }


    }
}
