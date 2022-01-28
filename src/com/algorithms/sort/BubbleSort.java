package com.algorithms.sort;

/** This class is ready **/
public class BubbleSort {

    public void bubbleSort(int[] arr){
        printArr(arr);
        System.out.println("-----");
        int size = arr.length;
        int tmp = 0;
        for (int i=0; i < size; i++){
            for (int j=0;j < size; j++){
                if(j+1==size) break;
                if(arr[j+1]<arr[j]){
                    //swap
                    tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        printArr(arr);
    }

    public void printArr(int[] arr){
        for (int x: arr) {
            System.out.print(x+" ");
        }
    }
}
