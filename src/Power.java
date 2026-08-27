public class Power {
    public static void main(String[] args) {
              System.out.println(power(3,3));
    }
    static double power(int x,int n){
        if(n<0){
            x = 1/x;
            n = -n;
        }
        if(n==0){
            return 1;
        }
        double half = power(x,n/2);
        if(n%2 == 0)
        {
            return half*half;
        }
        else return x*half*half;
    }
}
