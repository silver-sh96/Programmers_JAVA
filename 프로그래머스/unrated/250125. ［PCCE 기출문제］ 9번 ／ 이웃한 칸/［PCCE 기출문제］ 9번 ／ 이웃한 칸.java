class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = -1, len = board.length;
        String color = board[h][w];
        
        for(int i=h-1; i<=h+1; i++){
            for(int j=w-1; j<=w+1; j++){
                if((i>=0&&j>=0)&&(i<len&&j<len)&&(i==h||j==w)&&board[i][j].equals(color)){
                    answer++;
                }    
            }    
        }
        
        return answer;
    }
}