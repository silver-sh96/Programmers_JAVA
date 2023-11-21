class Solution {
    public int solution(String num_str) {
        int answer = 0;
        for(char c : num_str.toCharArray()){
            // (int)c 의 경우 ASCII 코드 반환
            answer += Character.getNumericValue(c);
        }
        return answer;
    }
}