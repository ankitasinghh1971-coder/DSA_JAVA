package Array;
import java.util.ArrayList;
import java.util.Arrays;
public class Union {




        public static int[] unionArray(int[] nums1, int[] nums2) {

            ArrayList<Integer> arr = new ArrayList<>();

            int n = nums1.length;
            int m = nums2.length;

            int i = 0;
            int j = 0;

            while (i < n && j < m) {

                if (nums1[i] < nums2[j]) {

                    if (arr.isEmpty() || arr.get(arr.size() - 1) != nums1[i]) {
                        arr.add(nums1[i]);
                    }

                    i++;
                }

                else if (nums1[i] == nums2[j]) {

                    if (arr.isEmpty() || arr.get(arr.size() - 1) != nums1[i]) {
                        arr.add(nums1[i]);
                    }

                    i++;
                    j++;
                }

                else {

                    if (arr.isEmpty() || arr.get(arr.size() - 1) != nums2[j]) {
                        arr.add(nums2[j]);
                    }

                    j++;
                }
            }

            while (i < n) {

                if (arr.isEmpty() || arr.get(arr.size() - 1) != nums1[i]) {
                    arr.add(nums1[i]);
                }

                i++;
            }

            while (j < m) {

                if (arr.isEmpty() || arr.get(arr.size() - 1) != nums2[j]) {
                    arr.add(nums2[j]);
                }

                j++;
            }

            return arr.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
        }

        public static void main(String[] args) {

            int[] nums1 = {1, 2, 2, 3, 4};
            int[] nums2 = {2, 3, 5, 5, 6};

            int[] result = unionArray(nums1, nums2);

            System.out.println(Arrays.toString(result));
        }

}
