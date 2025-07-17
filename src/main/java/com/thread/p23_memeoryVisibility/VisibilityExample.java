package com.thread.p23_memeoryVisibility;

public class VisibilityExample {

    private volatile boolean flag = false;

    public  void setFlag(){
        flag = true;
    }

    public boolean checkFlag(){
        return flag;
    }
    public synchronized void reviewFlag(){
        setFlag();
        checkFlag();
    }


}
