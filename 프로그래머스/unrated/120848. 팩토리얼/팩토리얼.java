class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=10; i>0; i--){
            int fctr = 1;
            for(int j=i; j>0; j--){
                fctr *= j;
            }
            if(fctr <= n){
                answer = i;
                break;
            }
        }
        return answer;
    }
}