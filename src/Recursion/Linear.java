package Recursion;

import java.util.ArrayList;

public class Linear {
    public static void main(String[] args) {
int[] arr = {3,4,55,2,88,55,43};
        System.out.println(find(arr,82,0));
        ArrayList<Integer> ans = findAllIndex(arr,55,0, new ArrayList<>());
        System.out.println(ans);
        System.out.println(findAllIndex2(arr,55,0));
    }
    static boolean find(int[] arr, int target, int i){
        if(i == arr.length){
            return false;
        }
        return arr[i] == target || find(arr,target, i+1);
    }
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAllIndex(arr,target,index+1,list);
    }

    static  ArrayList<Integer> findAllIndex2(int[] arr, int target,int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        //this will contain answer for that function call only
         if(arr[index] == target){
             list.add(index);
         }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr,target,index+1);
         list.addAll(ansFromBelowCalls);
         return list;
    }

}
