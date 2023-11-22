import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        /*
        ArrayList<Integer> del = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        for(int d : delete_list){
            del.add(d);
        }
        for(int i : arr){
            if(!del.contains(i)) result.add(i);
        }
        int[] answer = result.stream().mapToInt(x->x).toArray();
        */
        
        // arr를 intstream을 사용해 filter할때 delete_list와 같지않은 대상을 array화
        int[] answer = IntStream.of(arr)
                    .filter(i -> !IntStream.of(delete_list).anyMatch(s -> s == i))
                    .toArray();
        
        return answer;
    }
}