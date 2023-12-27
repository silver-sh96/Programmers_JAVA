import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        
        int correct = 0, unknown = 0;
        Map<Integer, Integer> ranking = new HashMap<>();
        List<Integer> arr = Arrays.stream(win_nums).boxed().collect(Collectors.toList());
        
        for(int sameNum=2, rank=5; sameNum<=6; sameNum++){
            ranking.put(sameNum, rank--);
        }
        
        for(int i=0; i<lottos.length; i++){
            if(arr.contains(lottos[i])){
                correct++;
            }else if(lottos[i] == 0){
                unknown++;
            }
        }
        
        int highest = ranking.containsKey(correct+unknown) ? ranking.get(correct+unknown) 
                      : (correct+unknown) > 6 ? 1 : 6; 
        int lowest = ranking.containsKey(correct) ? ranking.get(correct) : 6;
        
        int[] answer = {highest, lowest};
        
        return answer;
    }
}