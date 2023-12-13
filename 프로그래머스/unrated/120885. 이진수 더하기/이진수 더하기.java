class Solution {
    public String solution(String bin1, String bin2) {
        int bi1 = Integer.parseInt(bin1, 2), bi2 = Integer.parseInt(bin2, 2);
        int bin = bi1 + bi2;
        String answer = Integer.toBinaryString(bin);
        
        return answer;
    }
}