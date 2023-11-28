class Solution {
    public int solution(int n) {
        int answer = 1;
        while(true){
            if(answer*6%n == 0) break;
            else answer++;
        }
        /*
        int x = 6, y = n;
        while(n != x){
            if(n < x){
                n += y;
            }else if(n > x){
                x += 6;
            }
        }
        int answer = x/6;
        */
        
        return answer;
    }
}