class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int len = board.length;
        
        for(int i=0; i<len; i++){
            for(int j=0; j<len; j++){
                if(board[i][j] == 1){
                    continue;
                }else{
                    boolean isDanger = false;
                    for(int x=i-1; x<=i+1; x++){
                        for(int y=j-1; y<=j+1; y++){
                            if(x>=0 && x<len && y>=0 && y<len && board[x][y]==1){
                                isDanger = true;
                                break;
                            }
                        }
                    }
                    if(!isDanger) answer++;
                }
            }
        }
        
        return answer;
    }
}