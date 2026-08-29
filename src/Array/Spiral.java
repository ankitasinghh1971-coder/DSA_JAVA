package Array;

import java.util.List;
import java.util.ArrayList;

class Spiral {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();

        int n = matrix.length;
        int m = matrix[0].length;

        int top = 0;
        int left = 0;
        int bottom = n - 1;
        int right = m - 1;

        while (left <= right && top <= bottom) {

            // Left → Right
            for (int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            top++;

            // Top → Bottom
            for (int i = top; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }
            right--;

            // Right → Left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // Bottom → Top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }

        return ans;
    }    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        Spiral obj = new Spiral();

        List<Integer> result = obj.spiralOrder(matrix);

        System.out.println(result);
    }
}




