class Solution {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        while(sb.length() < n){
            sb.append(sb.length() % 2 == 0 ? "수" : "박");
        }
        
        return sb.toString();
    }
}