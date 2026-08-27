package Recursion;

public class ArraySort {
    public static void main(String[] args) {
int[] arr = {1,2,3,4,5,45,7};
        System.out.println(ans(arr,0));
    }
    static boolean ans(int[] arr , int i){
        if(i == arr.length -1){
            return true;
        }
        return arr[i] < arr[i+1] && ans(arr,i+1);
    }
}
