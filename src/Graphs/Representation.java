package Graphs;

import java.util.Scanner;

public class Representation {
    public static void main(String[] args) {
        //Adjacency matrix
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//nodes
        int m = sc.nextInt();//edges

        int[][] adj = new int[n+1][m+1];
        for(int i=0;i<m;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj[u][v] = 1;
            adj[v][u] = 1;
        }
    }
}
