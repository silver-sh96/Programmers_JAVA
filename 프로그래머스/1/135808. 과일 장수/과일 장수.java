import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0, len = score.length;
        Arrays.sort(score);
        
        for(int i=len; i>=m; i-=m){
            answer += score[i-m] * m;
        }
        /*
        int[][] result = new int[len/m][m];
        
        for(int i=0, idx=len; i<result.length; i++){
            result[i] = Arrays.copyOfRange(score, len - m, len);
            answer += result[i][0] * m;
            len -= m;
        }
        */
        
        return answer;
    }
}