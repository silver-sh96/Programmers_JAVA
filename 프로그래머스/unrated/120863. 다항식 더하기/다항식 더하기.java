class Solution {
    public String solution(String polynomial) {
        StringBuilder sb = new StringBuilder();
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
            if(xsum == 1) sb.append("x + ").append(numsum);
            else sb.append(xsum).append("x + ").append(numsum);
        } 
        if(numsum == 0 && xsum > 0){
            if(xsum == 1) sb.append("x");
            else sb.append(xsum).append("x");
        } 
        if(numsum > 0 && xsum == 0) sb.append(numsum);
        
        return sb.toString();
    }
}