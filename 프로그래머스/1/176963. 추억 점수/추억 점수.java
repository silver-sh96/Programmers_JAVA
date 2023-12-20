import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        
        int[] answer = new int[photo.length];
        
        for(int i=0; i<photo.length; i++){
            int sum = 0;
            List<String> arr = Arrays.asList(photo[i]);
            for(int j=0; j<name.length; j++){
                if(arr.contains(name[j])) sum += yearning[j];
            }
            answer[i] = sum;
        }
        
        return answer;
    }
}