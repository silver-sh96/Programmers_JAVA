class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n >= 0){
            n -= a;
            if(n >= 0){
                answer += b;
                n += b;
            } 
        }
        
        return answer;
    }
}