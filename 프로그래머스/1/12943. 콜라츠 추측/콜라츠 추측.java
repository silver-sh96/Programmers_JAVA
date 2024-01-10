class Solution {
    public int solution(int num) {
        int answer = 0;
        double dnum = (double) num;
        
        while(dnum != 1){
            dnum = dnum % 2 == 0 ? dnum / 2 : (dnum * 3) + 1;
            answer++;
            
            if(answer >= 500){
                answer = -1;
                break;
            }
        }
        
        return answer;
    }
}