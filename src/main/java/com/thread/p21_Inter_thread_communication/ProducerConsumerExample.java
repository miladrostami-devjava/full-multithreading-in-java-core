package com.thread.p21_Inter_thread_communication;

public class ProducerConsumerExample {


    public static void main(String[] args) {

        SharedResource resource = new SharedResource();
        Thread producer = new Thread(new Procedure(resource),"Producer");
        Thread consumer = new Thread(new Consumer(resource),"Consumer");

        producer.start();
        consumer.start();


    }


}
