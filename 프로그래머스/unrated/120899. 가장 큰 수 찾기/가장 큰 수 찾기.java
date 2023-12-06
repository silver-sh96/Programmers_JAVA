import java.util.*;

class Solution {
    public int[] solution(int[] array) {
        
        int cnt = 0;
        Map<Integer, Integer> m = new HashMap<>();
        for(int num : array){
            m.put(num, cnt);
            cnt++;
        }
        Arrays.sort(array);
        int[] answer = {array[array.length-1], m.get(array[array.length-1])};
        
        return answer;
    }
}