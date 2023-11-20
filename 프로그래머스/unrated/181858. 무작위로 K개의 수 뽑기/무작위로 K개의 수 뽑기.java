import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(!result.contains(arr[i]) && result.size() < k) result.add(arr[i]);
        }
        if(result.size()<k) 
            while(result.size()<k) result.add(-1);
        
        int[] answer = result.stream().mapToInt(a->a).toArray();
        
        return answer;
    }
}