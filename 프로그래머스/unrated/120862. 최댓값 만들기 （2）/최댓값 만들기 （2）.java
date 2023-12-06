import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int min = numbers[0]*numbers[1],
            max = numbers[numbers.length-1]*numbers[numbers.length-2];
        int answer = min > max ? min : max;
        
        return answer;
    }
}