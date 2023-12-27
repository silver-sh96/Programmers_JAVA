import java.util.*;

class Solution {
    public int solution(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        isPrime[0] = isPrime[1] = false; // 0과 1은 소수가 아님

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false; // i의 배수는 소수가 아님
                }
            }
        }

        int count = 0;
        for (boolean prime : isPrime) {
            if (prime) {
                count++;
            }
        }

        return count;
    }
}