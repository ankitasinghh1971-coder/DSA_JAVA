package TCS;

import java.util.ArrayList;
import java.util.*;

public class Easy {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i < n - 1; i++) {
            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                list.add(arr[i]);
            }
        }

        if (list.isEmpty()) {
            System.out.println(-1);
        } else {
            for (int num : list) {
                System.out.print(num + " ");
            }
        }
    }
}
