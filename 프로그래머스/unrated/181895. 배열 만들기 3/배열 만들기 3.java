import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> numbers = new ArrayList<>();
        //int[] answer = new int[((b1-a1)+1)+((b2-a2)+1)];
        for(int i=0; i<intervals.length; i++){
            int a = intervals[i][0];
            int b = intervals[i][1];
            for(int j=a; j<=b; j++){
                numbers.add(arr[j]);
            }
        }
        
        int[] answer = numbers.stream().mapToInt(x -> x).toArray();
        
        return answer;
    }
}