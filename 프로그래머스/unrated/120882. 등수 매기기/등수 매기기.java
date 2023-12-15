import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] average = new double[score.length];
        
        for(int i=0; i<score.length; i++){
            average[i] = (double)(score[i][0] + score[i][1]) / 2;
        }
        
        for(int j=0; j<average.length; j++){
            int rank = 1;
            for(int l=0; l<average.length; l++){
                if(average[l] > average[j]) rank++;
            }
            answer[j] = rank;
        }
        
        return answer;
    }
}