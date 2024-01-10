class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int gcd = findGCD(n, m), lcm = findLCM(n, m);
        answer[0] = gcd;
        answer[1] = lcm;
        
        return answer;
    }
    
    public static int findGCD(int n, int m){
        while(m != 0){
            int temp = m;
            m = n % m;
            n = temp;
        }
        return Math.abs(n);
    }
    
    public static int findLCM(int n, int m){
        return Math.abs(n*m) / findGCD(n, m);
    }
}