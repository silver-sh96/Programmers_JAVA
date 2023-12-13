import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        ArrayList<String> arr = new ArrayList<>();
        int cnt = 0;
        while(cnt < my_str.length()){
            if(cnt + n <= my_str.length()){
                arr.add(my_str.substring(cnt, cnt+n));
                cnt += n;
            }else{
                arr.add(my_str.substring(cnt, my_str.length()));
                cnt = my_str.length();
            }
        }
        
        String[] answer = arr.toArray(new String[arr.size()]);
        
        return answer;
    }
}