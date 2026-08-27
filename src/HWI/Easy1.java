package HWI;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Easy1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int k = sc.nextInt();

        int[] A = new int[N];
        for(int i=0;i<N;i++)
            A[i] = sc.nextInt();

        System.out.println(maxGoodSubarraySum(A, k));
    }
    static long maxGoodSubarraySum(int[] arr,int k){
        Map<Integer,Integer> freq = new HashMap<>();
        int left = 0;
        long sum = 0;
        long maxSum = 0;
        for(int right = 0;right<arr.length;right++){
            freq.put(arr[right],freq.getOrDefault(arr[right],0)+1 );
            sum = arr[right];
            while(freq.size()>k){
                freq.put(arr[left],freq.get(arr[left])-1);
                if(freq.get(arr[left]) == 0)
                    freq.remove(arr[left]);

                sum -= arr[left];
                left++;
            }
            maxSum = Math.max(maxSum,sum);

        }
        return maxSum;
    }
}
