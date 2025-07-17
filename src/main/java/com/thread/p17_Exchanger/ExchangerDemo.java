package com.thread.p17_Exchanger;

import java.util.concurrent.Exchanger;

public class ExchangerDemo {


    public static void main(String[] args) {

        Exchanger<String> exchanger = new Exchanger<>();

        new Thread(() -> {
            try {
                String data = "sending message from Thread-1";
                System.out.println("Thread-1 sending data  :" + data);
                String received = exchanger.exchange(data);
                System.out.println("Thread-1 received data   :" + received);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }).start();

        new Thread(() -> {
            try {
String data =  "sending message from Thread-2";
                System.out.println("Thread-2 sending data  :" + data);
                String received  = exchanger.exchange(data) ;
                System.out.println("Thread-2 received data   :" + received);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();


/*

        new Thread(() -> {
            try {
                String data =  "sending message from Thread-3";
                System.out.println("Thread-3 sending data  :" + data);
                String received  = exchanger.exchange(data) ;
                System.out.println("Thread-3 received data   :" + received);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                String data =  "sending message from Thread-4";
                System.out.println("Thread-4 sending data  :" + data);
                String received  = exchanger.exchange(data) ;
                System.out.println("Thread-4 received data   :" + received);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
*/

    }


}
