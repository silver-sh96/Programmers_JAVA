import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        /*
        ArrayList<Integer> arr = new ArrayList<>();
        for(char c : my_string.replaceAll("[^0-9]", "").toCharArray()){
            arr.add(Character.getNumericValue(c));
        }
        int[] answer = arr.stream().sorted().mapToInt(x->x).toArray();
        */
        int[] answer = Arrays.stream(my_string.replaceAll("[^0-9]", "").split(""))
                             .sorted().mapToInt(Integer::parseInt).toArray();
        return answer;
    }
}