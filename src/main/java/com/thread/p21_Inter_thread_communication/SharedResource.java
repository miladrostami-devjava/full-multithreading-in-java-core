package com.thread.p21_Inter_thread_communication;

import java.util.LinkedList;

public class SharedResource {
    private final LinkedList<Integer> queue = new LinkedList<>();
    private final int CAPACITY = 5;

    public synchronized void produce(int value) throws InterruptedException {

        while (queue.size() == CAPACITY){
            System.out.println("Queue is full. Producer is waiting...");
            wait();//waiting for empty capacity
        }
        queue.add(value);
        System.out.println("Produced ..." + " " + value);
        //notify for fulling capacity
        notify();

    }

    public synchronized int consume() throws InterruptedException {

        while (queue.isEmpty()){
            System.out.println("Queue is empty. Consumer is waiting...");
            wait();
        }

        int value = queue.removeFirst();
        System.out.println("Consumed ..." + " " + value);
 //notify the  thread
        notify();
        return value;
    }

}
