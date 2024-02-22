class Solution {
    public String solution(String s, int n) {
        StringBuilder result = new StringBuilder();
        
        for(char c : s.toCharArray()){
            if(c == ' '){
                result.append(String.valueOf(c));
            }else if(Character.isLowerCase(c)){
                result.append(String.valueOf((char) ((c - 'a' + n) % 26 + 'a')));  
            }else{
                result.append(String.valueOf((char) ((c - 'A' + n) % 26 + 'A')));  
            }
            
        }
        
        return result.toString();
    }
}