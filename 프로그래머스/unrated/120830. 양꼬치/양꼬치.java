class Solution {
    public int solution(int n, int k) {
        int lamb = n * 12000;
        while(n-10 >= 0){
            k--;
            n -= 10;
        }
        int juice = k * 2000;
        
        int answer = lamb + juice;
        
        return answer;
    }
}