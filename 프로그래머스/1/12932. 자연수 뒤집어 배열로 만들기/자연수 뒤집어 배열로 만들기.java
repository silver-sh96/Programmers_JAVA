class Solution {
    public int[] solution(long n) {
        int[] answer = new int[String.valueOf(n).length()];
        String[] strArr = String.valueOf(n).split("");
        
        for(int i=strArr.length-1, idx=0; i>=0; i--){
            answer[idx++] = Integer.parseInt(strArr[i]);
        }
        
        return answer;
    }
}