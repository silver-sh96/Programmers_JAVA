import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0, choose = (nums.length / 2);
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(map.get(nums[i]), 0) + 1);
        }
        
        answer = map.size() <= choose ? map.size() : choose;
        
        return answer;
    }
}