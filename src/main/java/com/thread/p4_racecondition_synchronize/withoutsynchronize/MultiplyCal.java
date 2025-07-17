package com.thread.p4_racecondition_synchronize.withoutsynchronize;

public class MultiplyCal {

    private Double number1=0.0,number2=0.0;

    public Double getNumber1(){
        number1++;
        return number1;
    }

    public Double getNumber2() {
        number2++;
        return number2;
    }

    public Double multiply(){
        return getNumber1()*getNumber2();
    }
}
