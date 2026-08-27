package Recursion;

public class Ascii {
    public static void main(String[] args) {
        char ch = 'a';
        System.out.println(ch+ 0);
        ans("","abc");
    }
    static void ans(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        ans(p+(ch+0),up.substring(1));
        ans(p,up.substring(1));
    }
}
