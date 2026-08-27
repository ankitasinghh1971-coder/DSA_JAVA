package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class SubSet {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int n = arr.length;
ArrayList<Integer> list = new ArrayList<>();
ans3(0,arr,list,n);
ans2("","abc");
        //System.out.println(ans2("","abc"));
        ans("", "abc");
    }
    static void ans(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        ans(p+ch,up.substring(1));
        ans(p,up.substring(1));
    }
    static ArrayList<String> ans2(String p, String up  ){
        if(up.isEmpty()){
            System.out.println(p);
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
      ArrayList<String> left =  ans2(p+ch,up.substring(1));
        ArrayList<String> right =  ans2(p,up.substring(1));
        left.addAll(right);
        return left;
    }
    static void ans3(int idx,int[] arr, ArrayList<Integer> ds,int n){
if(idx==n){
  for(int num: ds){
      System.out.print(num+ " ");
  }
    System.out.println();
    return;
}   ds.add(arr[idx]);
     ans3(idx+1,arr,ds,n);
    ds.remove(ds.size()-1);
    ans3(idx+1,arr,ds,n);
    }
}
