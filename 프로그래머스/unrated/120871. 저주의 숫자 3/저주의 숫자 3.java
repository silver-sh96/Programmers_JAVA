class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            while((i + answer) % 3 == 0 || String.valueOf((i + answer)).contains("3")){
                answer++;
            }
        }
        return answer + n;
    }
}