class Solution {
    public int[] solution(int num, int total) {
        
        int[] answer = new int[num];
        int startValue = (total / num) + (num / 2) - num + 1;
        
        for(int i=0; i<answer.length; i++){
            answer[i] = startValue + i;
        }
        
        return answer;
    }
}