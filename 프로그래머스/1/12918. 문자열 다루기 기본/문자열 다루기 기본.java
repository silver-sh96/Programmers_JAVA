class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if(!(s.length() == 4 || s.length() == 6) || !s.matches("\\d+")) answer = false; 
        return answer;
    }
}