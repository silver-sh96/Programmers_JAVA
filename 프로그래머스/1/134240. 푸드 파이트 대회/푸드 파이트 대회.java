class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<food.length; i++){
            int amt = (int) Math.ceil(food[i]/2);
            if(amt > 0) sb.append(String.valueOf(i).repeat(amt));
        }
        
        String reversStr = sb.reverse().toString();
        sb.reverse().append("0").append(reversStr);
        
        return sb.toString();
    }
}