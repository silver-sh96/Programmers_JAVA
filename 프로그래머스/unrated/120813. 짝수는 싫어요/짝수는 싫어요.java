import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<=n; i++){
            if(i%2 != 0) arr.add(i);
        }
        int[] answer = arr.stream().mapToInt(x->x).toArray();
        
        return answer;
    }
}