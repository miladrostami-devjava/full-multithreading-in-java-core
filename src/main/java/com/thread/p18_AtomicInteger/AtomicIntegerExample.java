package com.thread.p18_AtomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {

    public static void main(String[] args) {

        int initialValue =0;
        AtomicInteger atomicInteger = new AtomicInteger(initialValue);
        System.out.println("the initial value :" + atomicInteger.get());
        System.out.println("After added :" + atomicInteger.incrementAndGet());
        System.out.println("After dec :" + atomicInteger.decrementAndGet());

        atomicInteger.set(34);
        boolean isUpdated = atomicInteger.compareAndSet(10,45);
        System.out.println("is equals ?" + " "  + isUpdated);
        System.out.println("After compareAndSet :" + atomicInteger.get());




    }

}
