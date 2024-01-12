import java.util.*;

class Solution {
    public double solution(int[] arr) {
        /*
        int sum = Arrays.stream(arr).sum();
        double answer = (double) sum / arr.length;
        
        return answer;
        */
        return Arrays.stream(arr).average().getAsDouble();
    }
}