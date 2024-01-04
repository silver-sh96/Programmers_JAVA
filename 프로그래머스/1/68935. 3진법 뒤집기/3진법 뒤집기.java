class Solution {
    public int solution(int n) {
        StringBuilder strNum = new StringBuilder();
        
        while(n > 0){
            strNum.append(n%3);
            n /= 3;
        }
        
        int answer = Integer.parseInt(strNum.toString(), 3);
        
        return answer;
    }
}