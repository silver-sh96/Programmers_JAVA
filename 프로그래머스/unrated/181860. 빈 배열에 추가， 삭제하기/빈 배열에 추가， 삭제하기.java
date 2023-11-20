import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> X = new ArrayList<>();
        for(int i=0; i<flag.length; i++){
            int cnt = 0;
            if(flag[i]){
                while(cnt<(arr[i]*2)){
                    X.add(arr[i]);
                    cnt++;
                }
            }else{
                while(cnt<arr[i]){
                    X.remove(X.size()-1);
                    cnt++;
                }
            }    
        }
        
        int[] answer = X.stream().mapToInt(a->a).toArray();
        
        return answer;
    }
}