class Solution {
    public int solution(int[] number) {
        int answer = 0, len = number.length;
        
        for(int i=0; i<len; i++){
            for(int j=i+1; j<len; j++){
                for(int l=j+1; l<len; l++){
                    if(number[i] + number[j] + number[l] == 0) answer++;
                }
            }
        }
        
        return answer;
    }
}