import java.util.*;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
        int idx = 0;
        int[] result = new int[String.valueOf(n).length()];
        StringBuilder sb = new StringBuilder();
        
        for(String num : String.valueOf(n).split("")){
            result[idx++] = Integer.parseInt(num);
        }
        
        Arrays.sort(result);
        
        for(int i=result.length-1; i>=0; i--){
            sb.append(String.valueOf(result[i]));
        }
        
        answer = Long.parseLong(sb.toString());
        
        return answer;
    }
}