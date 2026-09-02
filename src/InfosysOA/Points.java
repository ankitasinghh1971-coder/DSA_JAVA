package InfosysOA;

import java.util.Scanner;

public class Points {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter array: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ans  = helper(arr,0,false);
        System.out.println(ans);
    }
    static int helper(int[] arr,int index,boolean flag){
        int n = arr.length;
        if(index == n){
            return 0;
        }
        int nottake = helper(arr, index + 1, flag);

        int take;

        if(!flag){
           take = arr[index] + helper(arr,index+1,true);

        }
        else{

        take = helper(arr,index+1,false)-arr[index];
        }
        return Math.max(take,nottake);
        }
    }

