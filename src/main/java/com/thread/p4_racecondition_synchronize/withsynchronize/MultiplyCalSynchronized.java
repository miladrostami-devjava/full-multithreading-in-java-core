package com.thread.p4_racecondition_synchronize.withsynchronize;

public class MultiplyCalSynchronized {

    private Double number1=0.0,number2=0.0;

    public synchronized Double getNumber1(){
        number1++;
        return number1;
    }

    public synchronized Double getNumber2() {
        number2++;
        return number2;
    }

    public synchronized Double multiply(){
        return getNumber1()*getNumber2();
    }
}
