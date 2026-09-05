package Greedy;

import java.util.*;

public class Meetings {

    public static int maxMeetings(int[] start, int[] end) {

        int n = start.length;

        int[][] meetings = new int[n][2];

        for (int i = 0; i < n; i++) {
            meetings[i][0] = start[i];
            meetings[i][1] = end[i];
        }

        int count = 0;
        int lastEnd = -1;

        Arrays.sort(meetings, (a, b) -> Integer.compare(a[1], b[1]));

        for (int i = 0; i < n; i++) {

            int currentStart = meetings[i][0];
            int currentEnd = meetings[i][1];

            if (currentStart > lastEnd) {
                count++;
                lastEnd = currentEnd;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of meetings: ");
        int n = sc.nextInt();

        int[] start = new int[n];
        int[] end = new int[n];

        System.out.println("Enter start times:");
        for (int i = 0; i < n; i++) {
            start[i] = sc.nextInt();
        }

        System.out.println("Enter end times:");
        for (int i = 0; i < n; i++) {
            end[i] = sc.nextInt();
        }

        int result = maxMeetings(start, end);

        System.out.println("Maximum number of meetings = " + result);

        sc.close();
    }
}
