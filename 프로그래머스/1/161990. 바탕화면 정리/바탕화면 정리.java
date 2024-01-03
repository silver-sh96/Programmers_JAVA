import java.util.*;
import java.util.Collections;

class Solution {
    public int[] solution(String[] wallpaper) {
        
        ArrayList<Integer> xArr = new ArrayList<>();
        ArrayList<Integer> yArr = new ArrayList<>();
        
        for(int y=0; y<wallpaper.length; y++){
            String[] paper = wallpaper[y].split("");
            for(int x=0; x<paper.length; x++){
                if(paper[x].equals("#")){
                    xArr.add(x);
                    yArr.add(y);
                }
            } 
        }
        
        Collections.sort(xArr);
        Collections.sort(yArr);
        
        int[] answer = {yArr.get(0), xArr.get(0), 
                        yArr.get(yArr.size()-1) + 1, 
                        xArr.get(xArr.size()-1) + 1};
        
        return answer;
    }
}