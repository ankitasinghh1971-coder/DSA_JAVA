package Hash;

import java.util.Arrays;

public class freq {
    public static void main(String[] args) {
        String st = "ABABCDESBAHSHXZ";
        int n = 0;
        for(int i=0;i<st.length();i++){
            n = Math.max(n,st.charAt(i)-65);
        }
        int[] hashmap = new int[n+1];
    for(int i=0;i<st.length();i++){
//        System.out.println(st.charAt(i)-65);
        hashmap[st.charAt(i)-65]++;
    }
        System.out.println(Arrays.toString(hashmap));
    }
}
