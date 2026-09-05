package Greedy;

import java.util.*;

public class Interval {

    public static int MaximumNonOverlappingIntervals(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> {
            if (a[1] != b[1]) {
                return Integer.compare(a[1], b[1]);
            }
            return Integer.compare(a[0], b[0]);
        });

        int count = 0;
        int End = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {

            if (intervals[i][0] < End) {
                count++;
            } else {
                End = intervals[i][1];
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of intervals: ");
        int n = sc.nextInt();

        int[][] intervals = new int[n][2];

        System.out.println("Enter start and end of each interval:");

        for (int i = 0; i < n; i++) {
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }

        int result = MaximumNonOverlappingIntervals(intervals);

        System.out.println("Minimum intervals to remove = " + result);

        sc.close();
    }
}
