import java.util.*;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicInteger;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        
        /*---------------------------------------------------------
                code	 date	    maximum	    remain
               ----------------------------------------
                 1	    20300104	  100	      80
                 2	    20300804	  847         37
                 3	    20300401	   10	       8
        ---------------------------------------------------------*/
        
        List<int[]> result = new ArrayList<>();
        String[] col = {"code", "date", "maximum", "remain"};
        AtomicInteger sortIdx = new AtomicInteger(0);
        
        for(int i=0; i<data.length; i++){
            for(int j=0; j<col.length; j++){
                if(ext.equals(col[j]) && data[i][j] < val_ext){
                    result.add(data[i]);
                }
                if(sort_by.equals(col[j])) sortIdx.set(j);
            }
        }
        
        result.sort(Comparator.comparingInt(list -> list[sortIdx.get()]));
        
        int[][] answer = result.toArray(new int[0][]);
        

        return answer;
    }
}