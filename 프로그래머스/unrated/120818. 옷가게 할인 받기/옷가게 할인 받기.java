class Solution {
    public int solution(int price) {
        int answer = 0;
        if(price >= 100000 && price < 300000){
            answer = (int) Math.floor(Double.valueOf(price) * 0.95);
        }else if(price >= 300000 && price < 500000){
            answer = (int) Math.floor(Double.valueOf(price) * 0.90);
        }else if(price >= 500000){
            answer = (int) Math.floor(Double.valueOf(price) * 0.80);
        }else if(price < 100000){
            answer = price;
        }
        
        return answer;
    }
}