package Bit;

import java.util.ArrayList;
import java.util.Scanner;

public class Subset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        int count=0;
        ArrayList<String> arr = new ArrayList<>();
        while(num>0){
            if((num&1) == 1){
                count++;
            }
            num=num/10;
        }

    }
}
