import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] arrClone = new int[arr.length];
        
        while(!Arrays.equals(arr, arrClone)){
            arrClone = arr.clone();
            for(int i=0; i<arr.length; i++){
                if(arr[i] < 50 && arr[i]%2 != 0){
                    arr[i] = arr[i]*2 + 1;
                }else if(arr[i] >= 50 && arr[i]%2 == 0){
                    arr[i] = arr[i]/2;
                }
            }
            answer++;
        }
        
        return answer-1;
    }
}