import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        /*
        for(int i=0; i<strArr.length; i++){
            int cnt = 0;
            for(int j=0; j<strArr.length; j++){
                if(strArr[i].length() == strArr[j].length()) cnt++;
            }
            if(answer < cnt) answer = cnt;
        }
        */
        Map<Integer, Integer> lengCnt = new HashMap<>();
        
        for(String str : strArr){
            // 현재 길이를 Key로 갖는 Map 개수를 1 증가시켜 lengthCountMap에 저장
            // getOrDefault -> lengCnt에서 현재 길이의 개수 가져오기 (없으면 기본값은 0)
            lengCnt.put(str.length(), lengCnt.getOrDefault(str.length(), 0) + 1);
        }
        
        for(int cnt : lengCnt.values()){
            // Math.max(a, b) -> a와 b중 큰 값 반환
            answer = Math.max(answer, cnt);
        }
        
        return answer;
    }
}