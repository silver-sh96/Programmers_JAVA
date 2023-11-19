import java.util.ArrayList;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = my_string.trim().split(" ");
        ArrayList<String> arr = new ArrayList<>();
        for(int i=0; i<answer.length; i++){
            if(!(answer[i].equals(""))) arr.add(answer[i]);
        }
        
        return arr.toArray(new String[arr.size()]);
    }
}