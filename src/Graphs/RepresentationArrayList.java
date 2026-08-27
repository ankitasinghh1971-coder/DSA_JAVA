package Graphs;

import java.util.ArrayList;
import java.util.Scanner;

public class RepresentationArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i=0;i<=n;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<m;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();

            list.get(u).add(v);
            list.get(v).add(u);
        }
        for(int i=0;i<list.size();i++){
            System.out.println(i +"-->"+ list.get(i));
        }
    }
}
