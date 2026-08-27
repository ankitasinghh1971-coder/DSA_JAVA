package Hash;

public class anagram {
    public static void main(String[] args) {
       String st1 = "LISTEN";
       String st2 = "SILENT";
        System.out.println(isAnagram(st1,st2));
    }
 static boolean isAnagram(String st1,String st2){

        if(st1.length() != st2.length()){
            return false;
        }
        int n = 0;
        for(int i=0;i<st1.length();i++){
            n = Math.max(n,st1.charAt(i)-65);
        }
        int[] hashmap = new int[256];
        for(char ch : st1.toCharArray()){
            hashmap[ch]++;
        }
        for (char ch: st2.toCharArray()){
            hashmap[ch]--;
        }
        for(int i: hashmap){
            if(i != 0){
                return false;
            }
        }
        return true;
    }
}
