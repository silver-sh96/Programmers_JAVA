import java.util.ArrayList;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> arr = new ArrayList<>();
        for(String str : strArr){
            if(!(str.contains("ad"))) arr.add(str);
        }
        String[] answer = arr.toArray(new String[arr.size()]);
        return answer;
    }
}