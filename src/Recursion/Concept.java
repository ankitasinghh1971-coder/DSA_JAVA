package Recursion;

public class Concept {
    public static void main(String[] args) {
        fun(5);
    }
    static void fun(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        fun(--n);
        //don't use n--- as it will first print the value and then subtract causing infinite loop and printing 5 each time

    }
}
