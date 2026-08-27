package Hash;

public class freqNum {

    public static void main(String[] args) {
        int[] arr = {5,6,5,6,9,6};
        int n = arr[0];
        for(int i=1;i<arr.length;i++){
            n = Math.max(n,arr[i]);
        }
        int[] hashTable = new int[n+1];
        for (int num:arr){
            hashTable[num]++;
        }
        System.out.println(hashTable[6]);
    }
}
