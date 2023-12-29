import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        
        for(int i=0, num = 0; i<=9; i++){
            if(!Arrays.asList(Arrays.stream(numbers).boxed().toArray(Integer[]::new)).contains(i)) 
                answer += i;
        }
        
        
        
        return answer;
    }
}