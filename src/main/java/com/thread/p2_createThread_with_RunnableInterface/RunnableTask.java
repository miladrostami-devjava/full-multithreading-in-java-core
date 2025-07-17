package com.thread.p2_createThread_with_RunnableInterface;

public class RunnableTask implements Runnable {
private String taskName;

    public RunnableTask(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {

        for (int i = 0; i < 6; i++) {
            System.out.println(taskName + " " + "is running : step :" + i);
            for (int j = 0; j < 3; j++) {
                System.out.println("thread name  for inner loop :" + j  + " " + taskName  +  " "+
                        "is :  " + Thread.currentThread().getName());
                System.out.println("thread interrupted   :" + Thread.interrupted());
                System.out.println("thread activeCount   :" + Thread.activeCount());
                Thread.dumpStack();
            }
        }

        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            System.out.println("the problem is thread loop");
            e.printStackTrace();
        }


    }
}
