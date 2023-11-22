import java.time.LocalDate;

class Solution {
    public int solution(int[] date1, int[] date2) {
        /*
        int answer = 0;
        for(int i=0; i<date1.length; i++){
            if(date1[i] < date2[i]){
                answer = 1;
                break;
            }else if(date1[i] > date2[i]){
                answer = 0;
                break;
            }
        }
        */
        LocalDate LDate1 = LocalDate.of(date1[0],date1[1],date1[2]);
        LocalDate LDate2 = LocalDate.of(date2[0],date2[1],date2[2]);
        int answer = LDate1.isBefore(LDate2) ? 1 : 0;
        
        return answer;
    }
}