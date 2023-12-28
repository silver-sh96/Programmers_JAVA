import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int horizon = 0, vertical = 0;
        
        for(int[] size : sizes){
            Arrays.sort(size);
            horizon = Math.max(horizon, size[0]);
            vertical = Math.max(vertical, size[1]);
        }
        
        return horizon * vertical;
    }
}