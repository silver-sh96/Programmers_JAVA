import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        
        int[] diff = new int[numlist.length];
        
        List<Integer> numArr = Arrays.stream(numlist).boxed().collect(Collectors.toList());
        List<Integer> result = new ArrayList<>();
        
        for(int i=0; i<numlist.length; i++){
            diff[i] = Math.abs(n-numlist[i]);
        }
        
        Arrays.sort(diff);
        
        for(int j=0; j<diff.length; j++){
            if(numArr.contains((diff[j]+n)) && !result.contains((diff[j]+n))){
                result.add(diff[j]+n);
            }else{
                result.add(Math.abs(n-diff[j]));
            }
        }
        
        
        return result.stream().mapToInt(x->x).toArray();
    }
}