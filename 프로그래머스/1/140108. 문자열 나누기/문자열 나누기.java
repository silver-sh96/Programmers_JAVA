class Solution {
    public int solution(String s) {
        int answer = 0, cnt1 = 0, cnt2 = 0;
        String compare = s.split("")[0];
        
        for(String str : s.split("")){
            if(cnt1 == cnt2){
                answer++;
                compare = str;
            }
            
            if(compare.equals(str)) cnt1++;
            else cnt2++;
        }
        
        return answer;
    }
}