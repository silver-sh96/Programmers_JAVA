import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int num : arr){
            result.add(num);
        }
        for(int i=0; i<query.length; i++){
            int x = query[i];
            if(i % 2 == 0){
                result.subList(x+1, result.size()).clear();
            }else{
                result.subList(0, x).clear();
            }
        }
        int[] answer = result.stream().mapToInt(z->z).toArray();
        
        return answer;
    }
}