import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> result = new ArrayList<>();
        
        for(int a=0; a<commands.length; a++){
            int i = commands[a][0], j = commands[a][1], k = commands[a][2];
            int[] arr = Arrays.copyOfRange(array, i-1, j);
            Arrays.sort(arr);
            result.add(arr[k-1]);
        }
        
        int[] answer = result.stream().mapToInt(x->x).toArray();
        
        return answer;
    }
}