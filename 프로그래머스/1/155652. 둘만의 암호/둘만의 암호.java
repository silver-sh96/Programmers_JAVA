class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder result = new StringBuilder();
        
        for(char ch : s.toCharArray()){
            for(int i=0; i<index; i++){
                ch++;
                if(ch > 'z') ch -= 26;
                if(skip.contains(String.valueOf(ch))) i--;
            }
            result.append(String.valueOf(ch));
            
        }
        
        return result.toString();
    }
}