import java.util.*;

class Solution {
    public int solution(String my_string) {
        /*
        int answer = 0;
        String[] arr = my_string.split("[aA-zZ]");
        for(String s : arr){
            if(!s.equals("")) answer += Integer.parseInt(s);
        }
        
        return answer;
        */
        return Arrays.stream(my_string.split("[aA-zZ]"))
            .filter(s -> !s.isEmpty()).mapToInt(Integer::parseInt).sum();
    }
}