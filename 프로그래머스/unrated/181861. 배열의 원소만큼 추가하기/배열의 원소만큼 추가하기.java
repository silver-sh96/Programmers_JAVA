import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> X = new ArrayList<>();
        for(int num : arr){
            int cnt = 0;
            while(cnt<num){
                X.add(num);
                cnt++;
            }
        }
        
        int[] answer = X.stream().mapToInt(a->a).toArray();
        
        return answer;
    }
}