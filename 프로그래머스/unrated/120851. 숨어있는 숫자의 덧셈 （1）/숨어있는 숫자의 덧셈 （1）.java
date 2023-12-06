class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for(char c : my_string.replaceAll("[^0-9]", "").toCharArray()){
            answer += Character.getNumericValue(c);
        }
        return answer;
    }
}