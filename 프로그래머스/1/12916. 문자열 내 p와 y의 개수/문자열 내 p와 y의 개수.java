class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0, y = 0;
        
        for(String str : s.split("")){
            String cvtStr = str.toLowerCase();
            
            if(cvtStr.equals("p")) p++;
            else if(cvtStr.equals("y")) y++;
        }

        return p == y ? true : false;
    }
}