import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0, max = 0;
        Map<Integer, Integer> arrMap = new HashMap<>();
        for(int num : array){
            int cnt = arrMap.getOrDefault(num, 0) + 1;
            if(cnt > max){
                max = cnt;
                answer = num;
            }else if(cnt == max){
                answer = -1;
            }
            arrMap.put(num, cnt);
        }
        /*
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
        */
        
        return answer;
    }
}