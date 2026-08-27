public class Strings {

        static int maxScore(String s) {
            int n = s.length();
            int ones = 0; // Count total ones in the string

            for (int i = 0; i < n; i++)
                if (s.charAt(i) == '1')
                    ones++;

            int zeros = 0; // Count zeros in the left substring
            int maxScore = 0;

            for (int i = 0; i < n - 1; i++) { // Exclude the last split
                if (s.charAt(i) == '0')
                    zeros++;
                else
                    ones--;
                maxScore = Math.max(maxScore, zeros + ones);
            }

            return maxScore;

    }
    public static void main(String[] args) {
       String s = "011101";
       
       int ans = maxScore(s);
        System.out.println(ans);
    }
}
