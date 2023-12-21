class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        String[] strArr = s.split("");
        StringBuilder sb = new StringBuilder();        
        
        for(int i=0; i<strArr.length; i++){
            answer[i] = sb.indexOf(strArr[i]) < 0 ? sb.indexOf(strArr[i]) : i - sb.lastIndexOf(strArr[i]);
            sb.append(strArr[i]);
        }
        
        return answer;
    }
}