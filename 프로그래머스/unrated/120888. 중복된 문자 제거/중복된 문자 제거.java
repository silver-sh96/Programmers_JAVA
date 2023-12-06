class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        for(String str : my_string.split("")){
            if(!sb.toString().contains(str)) sb.append(str);
        }
        return sb.toString();
    }
}