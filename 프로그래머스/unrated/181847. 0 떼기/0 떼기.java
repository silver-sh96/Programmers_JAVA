import java.util.*;

class Solution {
    public String solution(String n_str) {
        /*
        StringBuilder sb = new StringBuilder(n_str);
        for(char c : n_str.toCharArray()){
            if(c == '0') sb.deleteCharAt(0);
            else break;
        }
        
        return sb.toString();
        */
        n_str = String.valueOf(Integer.parseInt(n_str));
        
        return n_str;
    }
}