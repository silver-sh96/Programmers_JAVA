class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        
        String[] answer = new String[n];
        
        for(int i=0; i<arr1.length; i++){
            
            StringBuilder binaryStr1 = new StringBuilder(Integer.toBinaryString(arr1[i]));
            StringBuilder binaryStr2 = new StringBuilder(Integer.toBinaryString(arr2[i]));
            if(binaryStr1.length() < n) binaryStr1.insert(0, "0".repeat(n-binaryStr1.length()));
            if(binaryStr2.length() < n) binaryStr2.insert(0, "0".repeat(n-binaryStr2.length()));
            
            StringBuilder result = new StringBuilder();
            
            for(int j=0; j<n; j++){
                if(binaryStr1.charAt(j) == '1' || binaryStr2.charAt(j) == '1'){
                    result.append("#");
                }else{
                    result.append(" ");
                }
            }
            answer[i] = result.toString();
        }
        
        
        
        return answer;
    }
}