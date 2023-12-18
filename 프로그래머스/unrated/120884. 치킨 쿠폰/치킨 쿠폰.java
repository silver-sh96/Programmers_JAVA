class Solution {
    public int solution(int chicken) {
        int answer = 0;
        while((chicken+answer) >= 0){
            if((chicken+answer) / 10 >= 1){
                answer++;
            }
            chicken -= 10;
        }
        
        return answer;
    }
}