import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        for(String d : dic){
            int cnt = 0;
            for(String s : spell){
                if(Arrays.stream(d.split("")).filter(x->x.equals(s)).count() == 1) cnt++;
            }
            if(cnt == spell.length){
                answer = 1;
                break;
            } 
        }
        
        return answer;
    }
}