package InfosysOA;

import Array.Kadane;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class MSSSwaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
           arr[i] = sc.nextInt();
        }
        if(k==0){
          int ans =  KadaneAlgo(arr);
          System.out.println(ans);
        }
        else{
            int ans = swapCondition(arr,k);
            System.out.println(ans);
        }
    }
   static int KadaneAlgo(int[] arr){
        int currentSum = arr[0];
        int maxSum = arr[0];
        for(int i=1;i< arr.length;i++){
            currentSum = Math.max(arr[i],currentSum+arr[i]);
            maxSum = Math.max(currentSum,maxSum);
        }
        return maxSum;
    }
    static int swapCondition(int[] arr,int k){
        int n = arr.length;
        int answer = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                ArrayList<Integer> inside = new ArrayList<>();
                ArrayList<Integer> outside = new ArrayList<>();
                int sum = 0;
                for(int k1=i;k1<j;k1++){
                    inside.add(arr[k1]);
                    sum+= arr[k1];
                }
                for(int p=0;p<i;p++){
                    outside.add(arr[p]);
                }
                Collections.sort(inside);
                outside.sort(Collections.reverseOrder());
                int currentSum = sum;
                int swaps = Math.min(k,Math.min(inside.size(),outside.size()));
                for(int s =0;s<swaps;s++){
                    int smallestInside = inside.get(s);
                    int largestOutside = outside.get(s);
                    if(largestOutside<=smallestInside){
                        break;
                    }
                    currentSum += largestOutside-smallestInside;
                }
                answer = Math.max(answer,currentSum);
            }
        }
        return answer;
    }
}
