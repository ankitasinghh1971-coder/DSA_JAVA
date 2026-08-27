package Recursion;

public class Fact {
    public static void main(String[] args) {
        System.out.println(ans(3));
        System.out.println(sum(3));
    }
  static int ans(int n){
        if (n <= 0){
            return 1;
        }
      return n*ans(n-1);

    }
    static int sum(int n){
        if(n <= 0){
            return 0;
        }
        return n + sum(n-1);
    }
}
