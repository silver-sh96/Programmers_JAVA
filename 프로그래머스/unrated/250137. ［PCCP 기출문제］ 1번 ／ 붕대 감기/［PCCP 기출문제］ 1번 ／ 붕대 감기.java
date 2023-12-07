class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        
        /*---------------------------------------------------------
        
        [변수]
        t => 최대회복시간 || x => 회복량/sec || y => 추가회복량
        healStack => 회복지속시간 || maxHP => 최대체력량
        endTime => 전투종료시간 || speed => 공격시간 || damage => 공격력
        
        [조건]
        1. HP는 최대체력 이상 회복 불가하며 0이될 경우 전투 종료
        2. 스킬지속시간이 t에 도달하면 y만큼 추가로 회복 후 지속시간 초기화
        3. 공격당한 때에는 회복하지 않으며, 스킬 지속시간 초기화

        ---------------------------------------------------------*/
        
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