class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] arr = my_string.split("[aA-zZ]");
        for(String s : arr){
            if(!s.equals("")) answer += Integer.parseInt(s);
        }
        
        return answer;
    }
}