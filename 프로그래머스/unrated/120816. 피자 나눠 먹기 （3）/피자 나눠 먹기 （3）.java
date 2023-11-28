class Solution {
    public int solution(int slice, int n) {
        int answer = 1;
        while(true){
            if((answer * slice) < n) answer++;
            else break;
        }
        return answer;
    }
}