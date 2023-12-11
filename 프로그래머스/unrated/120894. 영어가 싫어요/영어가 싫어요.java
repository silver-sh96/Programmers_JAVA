class Solution {
    public long solution(String numbers) {
        
        String[] convert = {"zero", "one", "two", "three", "four", "five",
                            "six", "seven", "eight", "nine"};
        for(int i=0; i<convert.length; i++){
            if(numbers.contains(convert[i])) 
                numbers = numbers.replaceAll(convert[i], String.valueOf(i));
        }
        
        long answer = Long.parseLong(numbers);
        
        return answer;
    }
}