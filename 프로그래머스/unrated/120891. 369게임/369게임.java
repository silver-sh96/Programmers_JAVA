import java.util.*;

class Solution {
    public int solution(int order) {
        int answer = 0;
        /*
        for(String str : String.valueOf(order).split("")){
            if(str.equals("3") || str.equals("6") || str.equals("9")) answer++;
        }
        */
        answer = (int)Arrays.stream(String.valueOf(order).split(""))
            .map(Integer::parseInt).filter(i -> i==3 || i==6 || i==9).count();
        
        return answer;
    }
}