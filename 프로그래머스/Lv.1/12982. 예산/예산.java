import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0, sum = 0;
        Arrays.sort(d);
        for(int num : d){
            if((sum + num) <= budget){
                sum += num;
                answer++;
            }else{
                break;
            }
        }
        
        return answer;
    }
}