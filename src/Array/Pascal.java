package Array;

public class Pascal {


        public static int pascalTriangle(int r, int c) {

            int n = r - 1;
            int k = c - 1;

            int result = 1;

            for (int i = 0; i < k; i++) {
                result = result * (n - i);
                result = result / (i + 1);
            }

            return result;
        }

        public static void main(String[] args) {

            int r = 5;
            int c = 3;

            int result = pascalTriangle(r, c);

            System.out.println(result);
        }
    }

