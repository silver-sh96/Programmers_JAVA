import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<String, Integer> keyboard = new HashMap<>();
        
        for(int i=0; i<keymap.length; i++){
            int cnt = 1;
            for(String key : keymap[i].split("")){
                if(keyboard.containsKey(key)){
                    int idx = keyboard.get(key);
                    keyboard.put(key, Math.min(idx, cnt));
                }else{
                    keyboard.put(key, cnt);
                }
                cnt++;
            }
        }
        
        for(int j=0; j<targets.length; j++){
            boolean isExist = true;
            for(String target : targets[j].split("")){
                if(keyboard.containsKey(target)){
                    answer[j] += keyboard.get(target);
                }else{
                    isExist = false;
                    break;
                } 
            }
            answer[j] = isExist ? answer[j] : -1;
        }
        
        return answer;
    }
}