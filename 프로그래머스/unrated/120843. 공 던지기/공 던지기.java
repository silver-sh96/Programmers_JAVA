class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        for(int i=1, n=0; i<=k; i++){
            if(n < numbers.length) answer = numbers[n];
            else answer = numbers[n%numbers.length];
            n += 2;
        }
        return answer;
    }
}