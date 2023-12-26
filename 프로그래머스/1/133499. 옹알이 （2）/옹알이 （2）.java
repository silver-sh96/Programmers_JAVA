class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] bab = {"aya", "ye", "woo", "ma"};
        
        for(String bab1 : babbling){
            for(String bab2 : bab){
                if(bab1.contains(bab2.repeat(2))) continue;
                else bab1 = bab1.replace(bab2, " ");
            }
            
            bab1 = bab1.replace(" ", "");
            if(bab1.length() == 0) answer++;
        }
        
        return answer;
    }
}