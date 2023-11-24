class Solution {
    public String solution(String myString) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for(char c : myString.toCharArray()){
            if(c < 'l') sb.append(String.valueOf('l'));
            else sb.append(String.valueOf(c));
        }
        return sb.toString();
    }
}