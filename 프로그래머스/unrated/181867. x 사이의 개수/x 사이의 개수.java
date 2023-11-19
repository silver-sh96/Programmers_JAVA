import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(String myString) {
        /*
        ArrayList<Integer> arr = new ArrayList<>();
        int cnt = 0;
        for(int i=0; i<myString.length(); i++){
            if(myString.charAt(i) == 'x'){
                arr.add(cnt);
                cnt = 0;
            }else{
                cnt++;
            }
            if(i+1 == myString.length()) arr.add(cnt);
        }
        int[] answer = arr.stream().mapToInt(x->x).toArray();
        */
        int[] answer = Arrays.stream(myString.split("x", myString.length()))
            .mapToInt(x -> x.length())
            .toArray();
        
        return answer;
    }
}