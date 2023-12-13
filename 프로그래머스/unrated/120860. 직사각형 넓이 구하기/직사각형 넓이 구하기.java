class Solution {
    public int solution(int[][] dots) {
        int answer = 0, x = 0, y = 0;
        for(int i=0; i<dots.length-1; i++){
            if(x == 0){
                x = (int) Math.max(dots[i][0], dots[i+1][0]) - (int) Math.min(dots[i][0], dots[i+1][0]);
            }
            if(y == 0){
                y = (int) Math.max(dots[i][1], dots[i+1][1]) - (int) Math.min(dots[i][1], dots[i+1][1]);
            }
            
        }
        
        answer = x * y;
        
        return answer;
    }
}