package InfosysOA;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class FoodStamps {
    static class Food{
        long taste;
        int index;
        Food(long taste,int index){
            this.taste = taste;
            this.index = index;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] v = new int[n];
        int[] d = new int[n];
        for(int i=0;i<n;i++){
            v[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
           d[i] =  sc.nextInt();
        }
        PriorityQueue<Food> pq = new PriorityQueue<>((a,b)->Long.compare(b.taste,a.taste));
        for(int i=0;i<n;i++){
            pq.add(new Food(v[i],i ));
        }
int answer = 0;
        while(m>0){
            Food current = pq.poll();
            long current_taste  = current.taste;
            int index = current.index;
            if(current_taste<0)break;
            answer += current_taste;
            if(index<n-1){
                long next_taste = current_taste-d[index];
                pq.add(new Food(next_taste,index+1));
            }
            m--;
        }
        System.out.println(answer);
    }
}
