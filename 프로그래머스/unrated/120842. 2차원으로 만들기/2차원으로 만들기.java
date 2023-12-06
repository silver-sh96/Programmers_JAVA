class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        int x = 0, y = 0;
        for(int i=0; i<num_list.length; i++){
            answer[x][y] = num_list[i];
            if(y == n-1){
                x++;
                y=0;
            }else{
                y++;
            } 
        }
        return answer;
    }
}