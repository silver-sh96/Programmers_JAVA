import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        ArrayList<String> result = new ArrayList<>();
        for(int i=0; i<picture.length; i++){
            for(int j=0; j<k; j++){
                StringBuilder sb = new StringBuilder();
                for(int l=0; l<picture[i].length(); l++){
                    sb.append(String.valueOf(picture[i].charAt(l)).repeat(k));
                }
                result.add(sb.toString());
            }
            /*
            int cnt = 0;
            while(cnt<k){
                StringBuilder sb = new StringBuilder();
                for(int j=0; j<picture[i].length(); j++){
                    int cnt2 = 0;
                    while(cnt2<k){
                        sb.append(picture[i].charAt(j));
                        cnt2++;
                    }
                }
                result.add(sb.toString());
                cnt++;
            }
            */
        }
        String[] answer = result.toArray(new String[result.size()]);
        
        return answer;
    }
}