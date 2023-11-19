class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        /*
        for(int i=0; i+pat.length()<=myString.length(); i++){
            String str = myString.substring(i, i+pat.length());
            if(str.equals(pat)) answer++;
        }
        */
        for(int i=0; i<myString.length(); i++){
            if(myString.substring(i).startsWith(pat)) answer++;
        }
        return answer;
    }
}