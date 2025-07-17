package com.thread.p16_Semaphore;

import java.util.concurrent.Semaphore;

public class ResourceUser implements Runnable{

    private final Semaphore semaphore;
    private final String name;


    public ResourceUser(Semaphore semaphore, String name) {
        this.semaphore = semaphore;
        this.name = name;
    }

    @Override
    public void run() {

        System.out.println(name + "is waiting for a permit...\"");
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println( name+"acquired a permit and is using the resource.");


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(name + " is releasing the permit."   );


        semaphore.release();

        System.out.println(name + " free....");


    }
}
