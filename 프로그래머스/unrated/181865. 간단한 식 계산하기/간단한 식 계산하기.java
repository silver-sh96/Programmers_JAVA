class Solution {
    public int solution(String binomial) {
        int answer = 0;
        /*
        int a = Integer.parseInt(binomial.replaceAll(" ", "").replaceAll("[^\\d]", "x").split("x")[0]);
        int b = Integer.parseInt(binomial.replaceAll(" ", "").replaceAll("[^\\d]", "x").split("x")[1]);
        String op = binomial
            .replaceAll(" ", "")
            .replaceAll(String.valueOf(a), "")
            .replaceAll(String.valueOf(b), "");
        
        if(op.equals("+")) answer = a+b;
        if(op.equals("-")) answer = a-b;
        if(op.equals("*")) answer = a*b;
        */
        int a = Integer.parseInt(binomial.split(" ")[0]);
        int b = Integer.parseInt(binomial.split(" ")[2]);
        String op = binomial.split(" ")[1];
        
        if(op.equals("+")) answer = a+b;
        if(op.equals("-")) answer = a-b;
        if(op.equals("*")) answer = a*b;
        
        return answer;
    }
}