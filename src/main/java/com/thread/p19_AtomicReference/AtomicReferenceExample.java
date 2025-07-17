package com.thread.p19_AtomicReference;

import java.util.concurrent.atomic.AtomicReference;

public class AtomicReferenceExample {


    public static void main(String[] args) {

        //simple example
       /* AtomicReference<String> reference = new AtomicReference<>("hello");

        System.out.println("initial reference is :" + reference.get());

        reference.set("java");

        System.out.println("After initial :" + reference.get());

        boolean isUpdated = reference.compareAndSet("java","c#");
        System.out.println("is Updated ???" + isUpdated) ;


        System.out.println(" updated  reference that is :" +reference.get());*/


        //example with Student class

        AtomicReference<Student> reference = new AtomicReference<>(new Student("Mohammad"));

        System.out.println("initial student reference is :" + reference.get());

        reference.set(new Student("ali"));

        System.out.println("student After initial :" + reference.get());

        boolean isUpdated = reference.compareAndSet(new Student("Mohammad"),new Student("ali"));
        System.out.println("is Updated student???" + isUpdated) ;


        System.out.println("student updated  reference that is :" +reference.get());

    }


}
