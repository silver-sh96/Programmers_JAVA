class Solution {
    public int solution(int n) {
        int answer = 0, x = n;
        for(int i=1; i<=n; i++){
            if(n%i==0) answer++;
        }
        return answer;
    }
}