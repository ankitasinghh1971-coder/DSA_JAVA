package Recursion;

public class sumDigits {
    public static void main(String[] args) {
        System.out.println(ans(123));
    }
    static int ans(int n){
        if (n == 0){
            return 0;
        }
        return(n%10) + ans(n/10);
    }
}
