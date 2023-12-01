class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        String convert = "abcdefghij";
        String[] arrAge = String.valueOf(age).split("");
        for(int i=0; i<arrAge.length; i++){
            sb.append(String.valueOf(convert.charAt(Integer.parseInt(arrAge[i]))));
        }
        return sb.toString();
    }
}