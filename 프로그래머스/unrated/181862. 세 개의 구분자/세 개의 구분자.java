import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] answer = myStr.split("[abc]");
        ArrayList<String> arr = new ArrayList<>();
        
        for(String str : answer){
            if(!str.equals("")) arr.add(str);
        }
        
        if(arr.size() == 0) arr.add("EMPTY");
        
        return arr.toArray(new String[arr.size()]);
    }
}