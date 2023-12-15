class Solution {
    public int solution(int a, int b) {
        int answer = 1, div = 1, cnt = 0;
        
        for(int i=2; i<=b; i++){
            if(a % i == 0 && b % i == 0) div = i;
        }
        
        int mom = b / div;
        
        while(mom != 1){
            if(mom % 2 == 0){
                mom /= 2;
            }else if(mom % 5 == 0){
                mom /= 5;
            }else{
                answer = 2;
                break;
            }
        }
        
        return answer;
    }
}