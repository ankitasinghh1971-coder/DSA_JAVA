import java.util.Arrays;

public class MergeSort2 {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,0,-1};
        arr =mergeSort2(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergeSort2(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort2(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort2(Arrays.copyOfRange(arr,mid,arr.length));
        return merge2(left,right);
    }
    static int[] merge2(int[] first, int[] second){
        int[] mix = new int[first.length + second.length];
        int i =0;
        int j = 0;
        int k =0;

        while (i< first.length && j< second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }
            else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        while (i< first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j< second.length){
            mix[k] = second[j];
            j++;
            k++;

        }  return mix;  }
}
