package Bit;

public class NonDuplicate {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,2,1,3,6,4};
        System.out.println(ans(arr));
    }
    private static int ans(int[] arr){
        int uniqye = 0;
        for(int n:arr){
            uniqye= uniqye^n;
        }
        return uniqye;
    }
}
