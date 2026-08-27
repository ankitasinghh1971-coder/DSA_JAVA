package Heaps;

public class BinaryHeap {
    static int capacity;
    static int size;
    static int[] arr;

    BinaryHeap(int cap){
        capacity = cap;
        size = 0;
        arr = new int[capacity];
    }
    static int parent(int i){
        return (i-1)/2;
    }
    static int left(int i){
        return 2*i+1;
    }
    static int right(int i){
        return 2*i+2;
    }
    static void insert(int x){
        if(size == capacity){
            System.out.println("Binary heap overflown");
            return;
        }
        arr[size] = x;
        int k = size;
        size++;

        while (k!=0 && arr[parent(k)]>arr[k]){
            int temp = arr[parent(k)];
            arr[parent(k)] = arr[k];
            arr[k] = temp;
            k = parent(k);
        }
    }
    static void Heapify(int ind){
        int ri = right(ind);
        int li = left(ind);
        int smallest = ind;
        if(li<size && arr[li]<arr[smallest]){
            smallest = li;
        }
        if(ri <size && arr[ri]<arr[smallest]){
            smallest = ri;
        }
        if(smallest != ind){
            int temp = arr[ind];
            arr[ind] = arr[smallest];
            arr[smallest] = temp;
            Heapify(smallest);
        }
    }
    static int getMin(){
        return arr[0];
    }
    static int ExtractMin(){
        if (size <= 0)
            return Integer.MAX_VALUE;

        if (size == 1) {
            size--;
            return arr[0];
    }int mini = arr[0];

        // Copy last Node value to root Node
        arr[0] = arr[size - 1];

        size--;

        // Call heapify on root node
        Heapify(0);

        return mini;}

}
