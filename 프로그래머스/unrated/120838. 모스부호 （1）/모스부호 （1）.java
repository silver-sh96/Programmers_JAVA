import java.util.*;

class Solution {
    public String solution(String letter) {
        StringBuilder sb = new StringBuilder();
        String[] morse = { 
            ".-:a","-...:b","-.-.:c","-..:d",".:e","..-.:f","--.:g","....:h"
            ,"..:i",".---:j","-.-:k",".-..:l","--:m","-.:n","---:o",".--.:p"
            ,"--.-:q",".-.:r","...:s","-:t","..-:u","...-:v",".--:w","-..-:x"
            ,"-.--:y","--..:z"
        };
        Map<String, String> map = new HashMap<>();
        
        for(String m : morse){
            map.put(m.split(":")[0], m.split(":")[1]);
        }
        
        for(String str : letter.split(" ")){
            sb.append(map.get(str));
        }
        
        return sb.toString();
    }
}