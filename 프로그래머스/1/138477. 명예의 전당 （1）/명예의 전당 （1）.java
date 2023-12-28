import java.util.*;
import java.util.Collections;

class Solution {
    public int[] solution(int k, int[] score) {
        
        int[] answer = new int[score.length];
        List<Integer> arr = new ArrayList<>();
        
        for(int i=0; i<score.length; i++){
            arr.add(score[i]);
            Collections.sort(arr);
            if(arr.size() > k) arr.remove(0);
            
            answer[i] = arr.get(0);
        }
        
        return answer;
    }
}