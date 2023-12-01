class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        String vowel = "aeiou";
        for(char c : my_string.toCharArray()){
            if(!(vowel.contains(String.valueOf(c)))) sb.append(String.valueOf(c));
        }
        return sb.toString();
    }
}