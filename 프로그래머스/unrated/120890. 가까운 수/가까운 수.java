import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int diff = 0;
        int min = Integer.MAX_VALUE;
        Arrays.sort(array);
        
        for (int num : array) {
            diff = Math.abs(n - num);
            if (diff < min) {
                min = diff;
                answer = num;
            }
        }
        
        return answer;
    }
}