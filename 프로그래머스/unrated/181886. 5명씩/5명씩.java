import java.util.ArrayList;

class Solution {
    public String[] solution(String[] names) {
        ArrayList<String> arr = new ArrayList<>();
        for(int i=0; i<names.length; i++){
            if(i%5 == 0) arr.add(names[i]);
        }
        String[] answer = arr.toArray(new String[arr.size()]);
        return answer;
    }
}