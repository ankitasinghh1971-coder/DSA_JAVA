package InfosysOA;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

//you are given an array of integers and two integers K and F. the task is to find th maximum length of a contiguous subarray such that
//1. the XOR of all the elements in the subarray equals k and the frequency of eaxh distint element does not exeed F
public class Easy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();

        }
        System.out.println("Enter the value of K");
        int K = sc.nextInt();
        System.out.println("Enter the value of F");
        int F = sc.nextInt();

        int maxLength = 0;
        int startIndex = -1;
        int endIndex = -1;
        for(int i=0;i<n;i++){
            int XOR = 0;
           boolean fi = false;
            for(int j=i;j<n;j++){
XOR = XOR^arr[j];
                if(XOR==K){
                    fi = checkFrequency(arr,i,j,F);
                }
                if(fi){
                   int length = j-i+1;
                   if(length>maxLength){
                       maxLength = length;
                       startIndex = i;
                       endIndex = j;
                   }
                }
            }

        }

        if (maxLength == 0) {
            System.out.println("No valid subarray found");
        } else {

            System.out.println("Maximum Length = " + maxLength);
            System.out.println("Start Index = " + startIndex);
            System.out.println("End Index = " + endIndex);

            System.out.print("Subarray: ");

            for (int i = startIndex; i <= endIndex; i++) {
                System.out.print(arr[i] + " ");
            }
        }

    }
    static boolean checkFrequency(int[] arr,int i,int j,int F){
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int f = i;f<=j;f++){
            hash.put(arr[f], hash.getOrDefault(arr[f],0)+1);

        }
        for(int num: hash.values()){
            if(num>F){
                return false;
            }
        }
        return true;
    }

}
