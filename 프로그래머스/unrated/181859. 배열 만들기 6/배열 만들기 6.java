import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(stk.size() == 0) stk.add(arr[i]);
            else if(stk.size() > 0 && stk.get(stk.size()-1) == arr[i]) stk.remove(stk.size()-1);
            else if(stk.size() > 0 && stk.get(stk.size()-1) != arr[i]) stk.add(arr[i]);
        }
        
        int[] answer = stk.size() == 0 ? new int[]{-1} : stk.stream().mapToInt(a->a).toArray();
        return answer;
    }
}