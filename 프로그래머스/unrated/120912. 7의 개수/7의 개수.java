class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int num : array){
            for(String s : String.valueOf(num).split("")){
                if(s.equals("7")) answer++;
            }
        }
        return answer;
    }
}