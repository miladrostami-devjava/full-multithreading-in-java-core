package com.thread.p21_Inter_thread_communication;

public class Consumer implements Runnable{
    private final SharedResource sharedResource;

    public Consumer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }


    @Override
    public void run() {

        while (true){
            try {
                sharedResource.consume();
                Thread.sleep(500);
                System.out.println("consume.....");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
