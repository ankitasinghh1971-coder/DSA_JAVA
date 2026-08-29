package Array;
import java.util.*;

public class Sum3 {

    public static void main(String[] args) {

        int[] nums = {-1, 0, 1, 2, -1, -4};
        int target = 0;

        Arrays.sort(nums);

        int n = nums.length;

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n - 2; i++) {

            // Skip duplicate first elements
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = n - 1;

            while (left < right) {

                long sum = (long) nums[i]
                        + nums[left]
                        + nums[right];

                if (sum == target) {

                    ans.add(Arrays.asList(
                            nums[i],
                            nums[left],
                            nums[right]
                    ));

                    // Skip duplicate left values
                    while (left < right &&
                            nums[left] == nums[left + 1]) {
                        left++;
                    }

                    // Skip duplicate right values
                    while (left < right &&
                            nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;

                } else if (sum < target) {
                    left++;

                } else {
                    right--;
                }
            }
        }

        System.out.println(ans);
    }
}
