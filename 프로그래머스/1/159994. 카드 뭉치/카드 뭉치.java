import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        
        for(String str : goal){
            if(Arrays.asList(cards1).contains(str)){
                sb1.append(String.valueOf(Arrays.asList(cards1).indexOf(str)));
            }else{
                sb2.append(String.valueOf(Arrays.asList(cards2).indexOf(str)));
            }
        }
        
        for(int i=1; i<sb1.length(); i++){
            if(Character.getNumericValue(sb1.charAt(i)) != Character.getNumericValue(sb1.charAt(i-1)) + 1){
                answer = "No";
                break;
            }
        }
        
        for(int j=1; j<sb2.length(); j++){
            if(Character.getNumericValue(sb2.charAt(j)) != Character.getNumericValue(sb2.charAt(j-1)) + 1){
                answer = "No";
                break;
            }
        }
        
        return answer;
    }
}