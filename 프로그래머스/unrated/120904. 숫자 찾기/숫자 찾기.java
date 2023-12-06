class Solution {
    public int solution(int num, int k) {
        int answer = String.valueOf(num).contains(String.valueOf(k)) 
            ? String.valueOf(num).indexOf(String.valueOf(k)) + 1 : -1;
        
        return answer;
    }
}