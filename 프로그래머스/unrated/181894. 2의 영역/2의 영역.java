import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        int idx = 0;
        for(int num : arr){
            if(num == 2) nums.add(idx);
            idx++;
        }
        if(nums.size() == 0){
            answer = new int[]{-1};
        }else{
            int start = nums.get(0);
            int end = nums.get(nums.size()-1);
            for(int i=start; i<=end; i++){
                result.add(arr[i]);
            }
            answer = result.stream().mapToInt(x->x).toArray(); 
        }
        
        return answer;
    }
}