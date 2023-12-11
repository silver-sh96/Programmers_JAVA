import java.util.*;

class Solution {
    public String solution(String s) {
        Map<String, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        
        for(String str : s.split("")){
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        
        for(Map.Entry<String, Integer> m : map.entrySet()){
            if(m.getValue() == 1) sb.append(m.getKey());
        }
        
        char[] cArr = sb.toString().toCharArray();
        Arrays.sort(cArr);
        
        
        return new String(cArr);
    }
}