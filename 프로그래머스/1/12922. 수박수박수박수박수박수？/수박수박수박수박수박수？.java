class Solution {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        while(sb.length() < n){
            if(sb.length() % 2 == 0) sb.append("수");
            else sb.append("박");
        }
        
        return sb.toString();
    }
}