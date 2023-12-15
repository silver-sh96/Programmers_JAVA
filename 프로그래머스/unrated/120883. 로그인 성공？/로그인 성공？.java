class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        String id = id_pw[0], pw = id_pw[1];
        
        for(int i=0; i<db.length; i++){
            String dbid = db[i][0], dbpw = db[i][1];
            if(id.equals(dbid)){
                answer = pw.equals(dbpw) ? "login" : "wrong pw";
                break;
            }else{
                answer = "fail";
                if(i == db.length-1) break;
            }
        }
            
        return answer;
    }
}