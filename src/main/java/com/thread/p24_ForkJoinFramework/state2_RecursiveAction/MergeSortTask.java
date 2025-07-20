package com.thread.p24_ForkJoinFramework.state2_RecursiveAction;

import java.util.concurrent.RecursiveAction;

public class MergeSortTask extends RecursiveAction {
    private final int[] array;
    private final int start;
    private final int end ;
    private final int THRESHOLD = 10 ;

    public MergeSortTask(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }


    @Override
    protected void compute() {
if (end-start<= THRESHOLD){

    insertionSort(array,start,end);
}else {
    int mid = (start+end)/2;
    MergeSortTask leftTask   =new MergeSortTask(array,start,mid);
    MergeSortTask rightTask   =new MergeSortTask(array,mid,end);


    invokeAll(leftTask,rightTask);
    merge(array,start,mid,end);



}
    }


    private void insertionSort(int[] array,int start ,int end){
        for (int i = start  ; i <end ; i++) {
            for (int j = i; j > start && array[j-1] > array[j] ; j--) {
int temp = array[j];
array[j] = array[j-1];
array[j-1] = temp;

            }
        }
    }



    private void merge (int[] array,int start,int mid , int  end){

        int[] temp = new int[end-start];
        int i = start,j=mid , k = 0;

    while (i < mid && j < end){
        temp[k++] = (array[i]<array[j])? array[i++] : array[j++];
    }

    while (i < mid){
        temp[k++] = array[i++];
    }
    while (mid<end){
        temp[k++]= array[j++];
    }

    System.arraycopy(temp,0,array,start,temp.length);


    }


}
