class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int t = bandage[0], x = bandage[1], y = bandage[2];
        int healStack = 1, maxHP = health, cnt = 0,
            endTime = attacks[attacks.length-1][0];
        
        for(int sec=1; sec<=endTime; sec++){
            int speed = attacks[cnt][0], damage = attacks[cnt][1];
            
            
            
            if(sec == speed){
                health -= damage;
                healStack = 0;
                cnt++;
            }else{
                health += x;
                if(healStack == t){
                    health += y;
                    healStack = 0;
                }
            }
            
            
            
            if(health > maxHP){
              health = maxHP;  
            }else if(health <= 0){
                health = -1;
                break;
            }
            
            healStack++;
        }
        
        
        return health;
    }
}