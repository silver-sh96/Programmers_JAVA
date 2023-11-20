class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        
        if(arr2.length > arr1.length) answer = -1;
        if(arr2.length < arr1.length) answer = 1;
        if(arr2.length == arr1.length){
            int cnt1 = 0, cnt2 = 0;
            for(int i=0; i<arr1.length; i++){
                cnt1 += arr1[i];
                cnt2 += arr2[i];
                answer = cnt1 > cnt2 ? 1 : cnt2 > cnt1 ? -1 : 0;
            }
        }
        
        return answer;
    }
}