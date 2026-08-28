package Array;
import java.util.ArrayList;
import java.util.Arrays;
public class Intersection {



        public static int[] intersectionArray(int[] nums1, int[] nums2) {

            ArrayList<Integer> arr = new ArrayList<>();

            int n = nums1.length;
            int m = nums2.length;

            int i = 0;
            int j = 0;

            while (i < n && j < m) {

                if (nums1[i] == nums2[j]) {

                    // Add only if it is not already present
                    if (arr.isEmpty() || arr.get(arr.size() - 1) != nums1[i]) {
                        arr.add(nums1[i]);
                    }

                    i++;
                    j++;
                }

                else if (nums1[i] < nums2[j]) {
                    i++;
                }

                else {
                    j++;
                }
            }

            return arr.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
        }

        public static void main(String[] args) {

            int[] nums1 = {1, 2, 2, 3, 4};
            int[] nums2 = {2, 2, 3, 5, 6};

            int[] result = intersectionArray(nums1, nums2);

            System.out.println(Arrays.toString(result));
        }

}
