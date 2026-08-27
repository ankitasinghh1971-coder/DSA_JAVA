package SlidingWindow;

import java.util.Arrays;
import java.util.HashSet;

public class pairSum {
    public static void main(String[] args) {
        int[] nums = {-6,3,4,1,10,9};
        int n = nums.length;
        System.out.println(Arrays.toString(helper(nums,7))) ;
    }
   static int[] helper(int[] nums,int s ){
       HashSet<Integer> hash = new HashSet<>();
       for(int num : nums){
           int complement = s - num;
           if(hash.contains(complement)){
           return new int[]{num,complement};
           }
           hash.add(num);
       }
       return new int[]{-1,-1};
    }
}
