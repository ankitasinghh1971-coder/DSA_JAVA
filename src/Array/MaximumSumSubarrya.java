package Array;

public class MaximumSumSubarrya {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int currentSum = arr[0];
        int maxSum = arr[0];
        int tempStart = 0;
        int start =0;
        int end = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>currentSum+arr[i]){
                currentSum = arr[i];
                tempStart = i;
            }
            else{
                currentSum = currentSum+arr[i];
            }
            if(currentSum>maxSum){
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }
        System.out.println(maxSum + " "+ start+" "+end);
    }
}
