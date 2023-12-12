class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int n=i; n<=j; n++){
            for(String str : String.valueOf(n).split("")){
                if(str.contains(String.valueOf(k))) answer++;
            }
        }
        return answer;
    }
}