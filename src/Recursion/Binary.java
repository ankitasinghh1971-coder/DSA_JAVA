package Recursion;

public class Binary {
    public static void main(String[] args) {
        int[] arr = {3,5,32,3,7,8};
        int ans = search(arr,32,0,5);
        System.out.println(ans);
    }
    static int search(int[] arr, int target, int s , int e){
        if(s>e){
            return -1;
        }
        int m = s + (e-s)/2;
        if(arr[m] == target){
            return m;
        }
        else if (target > arr[m]){
            return search(arr,target,m+1,e);
        }
        else {
            return search(arr,target,s,m-1);
        }
    }
}
