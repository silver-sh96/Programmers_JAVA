class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for(int i=0; i<num_list.length; i++){
            answer = num_list[i] < 0 ? i : -1;
            if(answer == i) break;
        }
        return answer;
    }
}