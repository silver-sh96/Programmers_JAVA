class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        
        for(String str : String.valueOf(x).split("")){
            sum += Integer.parseInt(str);
        }
        
        if(x % sum != 0) answer = false;
        
        return answer;
    }
}