import java.util.*;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        ArrayList<String> strArr = new ArrayList<>(Arrays.asList(s1));
        for(int i=0; i<s2.length; i++){
            if(strArr.contains(s2[i])) answer++;
        }
        
        return answer;
    }
}