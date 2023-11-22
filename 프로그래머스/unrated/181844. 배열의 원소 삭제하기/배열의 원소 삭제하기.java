import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> del = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        for(int d : delete_list){
            del.add(d);
        }
        for(int i : arr){
            if(!del.contains(i)) result.add(i);
        }
        
        
        int[] answer = result.stream().mapToInt(x->x).toArray();
        
        return answer;
    }
}