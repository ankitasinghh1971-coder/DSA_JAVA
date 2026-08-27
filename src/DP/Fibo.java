package DP;

import java.util.Arrays;

public class Fibo {
    public static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(memfib(n,dp));
        System.out.println(tabfib(n));
        System.out.println(optifib(n));
    }
    public static int memfib(int n ,int[] dp){//tc - o(n) & sc - o(n) + o(n);
        if(n<=1){
            return n;
        }
        if(dp[n]!=-1)return dp[n];

        return dp[n] = memfib(n-1,dp) + memfib(n-2,dp);

    }
    static int tabfib(int n){//tc - o(n) & sc - o(n)
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
static int optifib(int n){//tc - o(n) & sc - o(1)
        int prev2 = 0;
        int prev1 = 1;
        for(int i=2;i<=n;i++){
            int curi = prev1+prev2;
            prev2 = prev1;
            prev1 = curi;
        }
        return prev1;
}
}
