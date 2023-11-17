class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        for(char c : myString.toCharArray()){
            String str = String.valueOf(c);
            str = str.equals("a") || str.equals("A") ? str.toUpperCase() : str.toLowerCase();
            sb.append(str);
        }
        return sb.toString();
    }
}