class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i=0; i<quiz.length; i++){
            String[] exp = quiz[i].split(" ");
            int num = Integer.parseInt(quiz[i].split(" ")[0]);
            int result = Integer.parseInt(quiz[i].split(" ")[quiz[i].split(" ").length-1]);
            for(int j=1; j<exp.length; j++){
                if(exp[j].equals("+")) num += Integer.parseInt(exp[j+1]);
                else if(exp[j].equals("-")) num -= Integer.parseInt(exp[j+1]);
            }
            answer[i] = num == result ? "O" : "X";
        }
        return answer;
    }
}