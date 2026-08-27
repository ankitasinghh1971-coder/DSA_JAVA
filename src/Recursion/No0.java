package Recursion;

public class No0 {
    public static void main(String[] args) {
        System.out.println(ans(30204));
    }
    static int ans(int n){
        return helper(n,0);
    }
    private static int helper(int n, int c){
        if(n==0){
            return c;
        }
        int rem = n%10;
        if(rem == 0){
            return helper(n/10,c+1);
        }
        return helper(n/10,c);
    }
}
