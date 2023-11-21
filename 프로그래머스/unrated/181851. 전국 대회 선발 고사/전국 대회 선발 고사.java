import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        Map<Integer, Integer> info = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<attendance.length; i++){
            if(attendance[i]){
                info.put(rank[i], i);
                arr.add(rank[i]);
            }
        }
        Collections.sort(arr);
        
        int answer = (10000*info.get(arr.get(0))) + (100*info.get(arr.get(1))) + info.get(arr.get(2));
        
        return answer;
    }
}