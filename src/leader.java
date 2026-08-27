import java.util.ArrayList;

public class leader {
    public static void main(String[] args) {
        int[] arr = {12,4,1,7,5,6};
        ArrayList<Integer> ans = new ArrayList<>();
ans.add(arr[arr.length-1] );
        for(int i=0;i<arr.length;i++){

        for(int j=i+1;j<arr.length;j++){
            if(arr[i]<=arr[j]){
                break;
            }
            if(j == arr.length-1){
                ans.add(arr[i]);
            }
        }

        }
        System.out.println(ans);
    }
}
