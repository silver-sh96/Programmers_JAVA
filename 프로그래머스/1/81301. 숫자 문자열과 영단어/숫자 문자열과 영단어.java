class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] nums = {"zero : 0", "one : 1", "two : 2", "three : 3", 
                         "four : 4", "five : 5", "six : 6", "seven : 7", 
                         "eight : 8", "nine : 9"};
        for(int i=0; i<nums.length; i++){
            if(s.contains(nums[i].split(" : ")[0])){
                s = s.replaceAll(nums[i].split(" : ")[0], nums[i].split(" : ")[1]);
            }
        }
        
        answer = Integer.parseInt(s);
        
        return answer;
    }
}