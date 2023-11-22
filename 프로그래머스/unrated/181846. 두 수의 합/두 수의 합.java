import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        //BigInteger -> 무한에 가까운 정수를 표현할때 사용하는 Data Type
        BigInteger  x = new BigInteger(a);
        BigInteger  y = new BigInteger(b);
        String answer = String.valueOf(x.add(y));
        return answer;
    }
}