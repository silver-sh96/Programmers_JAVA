class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int x = 0, y = 0;
        boolean isY = false;
        for(int i=1; i<=n*n; i++){
            if(i<=n){
                if(i>1) y++;
                answer[x][y] = i;
            }else{
                if(x<n-1 && answer[x+1][y]==0 && !isY){
                    x++;
                    answer[x][y] = i;
                    if(!(x<n-1 && answer[x+1][y]==0)) isY = true;
                }else if(y>0 && answer[x][y-1]==0 && isY){
                    y--;
                    answer[x][y] = i;
                    if(!(y>0 && answer[x][y-1]==0)) isY = false;
                }else if(x>0 && answer[x-1][y]==0 && !isY){
                    x--;
                    answer[x][y] = i;
                    if(!(x>0 && answer[x-1][y]==0)) isY = true;
                }else if(y<n-1 && answer[x][y+1]==0 && isY){
                    y++;
                    answer[x][y] = i;
                    if(!(y<n-1 && answer[x][y+1]==0)) isY = false;
                }
            }
        }
                
        return answer;
    }
}