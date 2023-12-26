class Solution {
    public String solution(String new_id) {
        new_id = new_id.toLowerCase();
        new_id = new_id.replaceAll("[^a-z0-9\\-_.]", "");
        while(new_id.contains("..")){
            new_id = new_id.replace("..", ".");
        }
        if(new_id.startsWith(".")) new_id = new_id.replaceFirst(".", "");
        if(new_id.endsWith(".")) new_id = new_id.substring(0, new_id.length()-1);
        if(new_id.equals("")) new_id = "a";
        if(new_id.length() >= 16){
            new_id = new_id.substring(0, 15);
            if(new_id.endsWith(".")) new_id = new_id.substring(0, new_id.length()-1);
        }
        while(new_id.length() <= 2){
            StringBuilder sb = new StringBuilder(new_id);
            sb.append(String.valueOf(new_id.charAt(new_id.length()-1)));
            new_id = sb.toString();
        }
        
        String answer = new_id;
        return answer;
    }
}