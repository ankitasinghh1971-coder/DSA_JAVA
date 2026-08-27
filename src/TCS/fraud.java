package TCS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class fraud {
    static class Transaction{
        String sender;
        String receiver;
        double amount;
        int timestamp;
        Transaction(String sender,String receiver,double amount, int timestamp){
            this.sender = sender;
            this.receiver = receiver;
            this.amount = amount;
            this.timestamp = timestamp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String,Integer> map = new HashMap<>();
        ArrayList<Transaction> frauds = new ArrayList<>();

        for(int i=0;i<n;i++){
            String sender = sc.next();
            String receiver = sc.next();
            double amount = sc.nextDouble();
            int timestamp = sc.nextInt();
            String  key = sender+ "#" +receiver+ "#" +amount;

            if(map.containsKey(key)){
                int prevTime = map.get(key);
                if(timestamp - prevTime <=60){
                    frauds.add(new Transaction(sender,receiver,amount,timestamp));
                }
            }
            map.put(key,timestamp);

        }
    if(frauds.size() == 0){
        System.out.println("No fraud");
    }
    else {
        for (Transaction t : frauds) {
            System.out.printf("%s %s %.2f %d%n",
                    t.sender,
                    t.receiver,
                    t.amount,
                    t.timestamp);
        }
    }
    }



    }


