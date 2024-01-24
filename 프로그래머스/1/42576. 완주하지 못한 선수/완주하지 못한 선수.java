import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        
        for(String str : participant){
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        
        for(String str2 : completion){
            map.replace(str2, map.get(str2) - 1);
        }
        
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() != 0){
                answer = entry.getKey();
                break;
            }
        }
        
        return answer;
    }
}