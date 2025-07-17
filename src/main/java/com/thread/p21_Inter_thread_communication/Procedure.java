package com.thread.p21_Inter_thread_communication;

public class Procedure implements Runnable
{
    private final SharedResource sharedResource;

    public Procedure(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }


    @Override
    public void run() {

        try {
            int value = 0;
            while (true){
                sharedResource.produce(value++);
                Thread.sleep(200);
                System.out.println("produce......");
            }

        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
