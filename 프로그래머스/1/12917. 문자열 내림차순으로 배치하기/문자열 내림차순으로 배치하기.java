import java.util.*;

class Solution {
    public String solution(String s) {
        char[] result = s.toCharArray();
        Arrays.sort(result);
        StringBuilder sb = new StringBuilder(new String(result));
        
        return sb.reverse().toString();
    }
}