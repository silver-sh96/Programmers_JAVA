import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        int[] cnt = new int[array[array.length-1]+1];
        
        for(int i=0; i<array.length; i++){
            cnt[array[i]]++;
        }
        int max = cnt[0];
        for(int j=1; j<cnt.length; j++){
            if(max < cnt[j]){
                max = cnt[j];
                answer = j;
            }else if(max == cnt[j]){
                answer = -1;
            }
        }
        
        return answer;
    }
}