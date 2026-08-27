package Heaps;

public class deletionHeap {
    public static void main(String[] args) {
        int arr[] = {55,54,53,50,52};
        int n = arr.length;
        n = deleteNode(arr,n);
printArray(arr,n);
    }
    static int deleteNode(int[] arr,int n){
   int lastElement = arr[n-1];
   arr[0] = lastElement;
   n = n-1;
   heapify(arr,n,0);
   return n;
    }
    static void heapify(int[] arr,int n,int i){
        int largest = i;
        int left = 2*i+1;
        int right = 2*i+2;
        if(left<n && arr[largest]<arr[left]){
           largest = left;
        }
        if(right<n && arr[largest]<arr[right]){
            largest = right;
        }
        if(largest != i){
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
heapify(arr,n,largest);
        }
    }
    static void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
}
