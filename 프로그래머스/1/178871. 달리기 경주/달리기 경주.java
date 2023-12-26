import java.util.*;
import java.util.Collections;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> ranking = new HashMap<>();
        for(int i=0; i<players.length; i++){
            ranking.put(players[i], i);
        }
        
        for(String call : callings){
            int rank = ranking.get(call);
            String frontPlayer = players[rank-1];
            
            ranking.replace(frontPlayer, rank);
            players[rank] = frontPlayer;
            
            ranking.replace(call, rank-1);
            players[rank-1] = call; 
        }
        
        return players;
    }
}