package TCS;

import java.util.Scanner;

public class Gym {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n%12 == 0){
            System.out.println((n/12)*15000);
        }
       else if(n%9 == 0){
            System.out.println((n/9)*12000);
        }
     else    if(n%6 == 0){
            System.out.println((n/6)*7000);

        }
   else if(n%3 == 0){
        System.out.println((n/3)*5000);
    }
   else{
            System.out.println("ERROR");
        }
    }
}
