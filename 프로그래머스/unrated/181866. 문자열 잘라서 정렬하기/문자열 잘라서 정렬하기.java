import java.util.*;

class Solution {
    public String[] solution(String myString) {
        ArrayList<String> arr = new ArrayList<>();
        String[] answer = myString.trim().split("x");
        Arrays.sort(answer);
        
        for(String str : answer){
            if(!(str.equals(""))) arr.add(str);
        }
        
        return arr.toArray(new String[arr.size()]);
    }
}