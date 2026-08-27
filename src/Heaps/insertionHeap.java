package Heaps;

import java.util.Arrays;

public class insertionHeap {

    public static void main(String[] args) {
        int MAX = 1000;
        int[] arr = new int[MAX];
        arr[0] = 5;
        arr[1] =4;
        arr[2]=3;
        arr[3] =2;
        arr[4]=1;
        int n = 5;
        int key = 15;

        insertNode(arr,n,key);

        printArray(arr,n);
    }
    static void insertNode(int arr[],int n,int key){
     n = n+1;
    arr[n-1] = key;
    heapify(arr,n,n-1);
    }
    static int heapify(int[] arr,int n,int i){
        int parent = (i-1)/2;
        if(parent >=0){
            if(arr[parent]<arr[i]){
                int swap  = arr[parent];
                arr[parent] = arr[i];
                arr[i] = swap;
                heapify(arr,n,parent);
            }
        }
        return 0;

    }
    static void printArray(int[] arr,int n){
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
}
