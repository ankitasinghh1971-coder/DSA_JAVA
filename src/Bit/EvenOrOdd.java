package Bit;

import java.util.Scanner;



public class EvenOrOdd {
 public static void main(String[] args) {
  System.out.println("Enter your number:");
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();

  System.out.println(ans(n));
 }
 public static boolean ans(int n){
  return (n & 1) == 1;
 }
}
