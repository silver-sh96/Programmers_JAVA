class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int xsum = 0, numsum = 0;
        for(String poly : polynomial.split(" ")){
            if(poly.contains("x")){
                if(poly.length() > 1){
                    xsum += Integer.parseInt(poly.replace("x", ""));
                }else{
                    xsum++;
                }
            }else if(!poly.equals("+")){
                numsum += Integer.parseInt(poly);
            }      
        }
        
        if(numsum > 0 && xsum > 0){
            if(xsum == 1) answer = "x + "+String.valueOf(numsum);
            else answer = String.valueOf(xsum)+"x + "+String.valueOf(numsum);
        } 
        if(numsum == 0 && xsum > 0){
            if(xsum == 1) answer = "x";
            else answer = String.valueOf(xsum)+"x";
        } 
        if(numsum > 0 && xsum == 0) answer = String.valueOf(numsum);
        
        return answer;
    }
}