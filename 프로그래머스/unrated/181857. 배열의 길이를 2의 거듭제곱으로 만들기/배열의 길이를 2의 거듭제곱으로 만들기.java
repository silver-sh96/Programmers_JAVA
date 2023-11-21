import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        /*
        ArrayList<Integer> result = new ArrayList<>();
        for(int n : arr){
            result.add(n);
        }
        int power = 1;  // 거듭제곱 변수 초기화
        while(power < result.size()){   // 인접한 거듭제곱 변수 찾기
            power *= 2;
        }
        if(result.size() < power){
            while(result.size() < power){
                result.add(0);
            }
        }
        
        int[] answer = result.stream().mapToInt(a->a).toArray();
        */
        
        int len = 1;
        while(len < arr.length){
            len *= 2;
        }
        
        return Arrays.copyOf(arr, len);
    }
}