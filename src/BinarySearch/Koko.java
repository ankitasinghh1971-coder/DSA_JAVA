package BinarySearch;
import java.util.*;
public class Koko {




        static int minimumRateToEatBananas(int[] nums, int h) {

            int n = nums.length;

            // Find maximum pile
            int maxi = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                maxi = Math.max(maxi, nums[i]);
            }

            int low = 1;
            int high = maxi;

            // Binary Search
            while (low <= high) {

                int mid = low + (high - low) / 2;

                long totalHours = helper(nums, mid);

                if (totalHours <= h) {
                    // mid is possible, try smaller speed
                    high = mid - 1;
                } else {
                    // mid is too slow
                    low = mid + 1;
                }
            }

            return low;
        }

        static long helper(int[] nums, int rate) {

            long ans = 0;

            for (int i = 0; i < nums.length; i++) {

                // Ceiling of nums[i] / rate
                ans += (nums[i] + rate - 1) / rate;
            }

            return ans;
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            int[] nums = new int[n];

            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            int h = sc.nextInt();

            int answer = minimumRateToEatBananas(nums, h);

            System.out.println(answer);

            sc.close();
        }
    }

