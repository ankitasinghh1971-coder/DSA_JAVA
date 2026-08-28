package Array;

import java.util.Arrays;

public class LeftRotate {

    public static void rotateArrayByOne(int[] nums) {

        // Reverse the entire array
        rev(nums, 0, nums.length - 1);

        // Reverse everything except the last element
        rev(nums, 0, nums.length - 2);
    }

    public static void rev(int[] nums, int start, int end) {

        while (start < end) {

            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};

        System.out.println("Before rotation: " + Arrays.toString(nums));

        rotateArrayByOne(nums);

        System.out.println("After rotation:  " + Arrays.toString(nums));
    }
}
