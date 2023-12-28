import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        
        Stack<Integer> stk = new Stack<>();
        stk.push(arr[0]);
        
        for(int i=1; i<arr.length; i++){
            if(stk.peek() != arr[i]) stk.push(arr[i]);
        }
        
        int[] answer = stk.stream().mapToInt(x->x).toArray();
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        //System.out.println(stk);

        return answer;
    }
}