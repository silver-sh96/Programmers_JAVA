import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] copy = Arrays.copyOfRange(emergency, 0, emergency.length);
        Arrays.sort(copy);
        Map<Integer, Integer> m = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        int rank = copy.length;
        
        for(int num : copy){
            m.put(num, rank);
            rank--;
        }
        
        for(int num2 : emergency){
            result.add(m.get(num2));
        }
        
        int[] answer = result.stream().mapToInt(x->x).toArray();
        
        return answer;
    }
}