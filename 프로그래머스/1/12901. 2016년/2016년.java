import java.time.*;

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        //String answer = LocalDate.of(2016, a, b).getDayOfWeek().toString().substring(0, 3);
        String[] day = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
        int[] date = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int allDay = 0;
        
        for(int i=0; i<a-1; i++){
            allDay += date[i];
        }
        allDay += (b - 1);
        answer = day[allDay % 7];
        
        return answer;
    }
}