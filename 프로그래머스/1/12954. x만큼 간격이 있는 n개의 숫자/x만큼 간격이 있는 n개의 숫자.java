import java.util.*;

class Solution {
    public long[] solution(int x, int n) {
        
        List<Long> result = new ArrayList<>();
        
        for(long i=1; i<=n; i++){
            result.add(x*i);
        }
        
        long[] answer = result.stream().mapToLong(a->a).toArray();
        
        return answer;
    }
}