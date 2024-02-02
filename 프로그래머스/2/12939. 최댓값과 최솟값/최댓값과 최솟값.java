class Solution {
    public String solution(String s) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        String[] input = s.split(" ");
        for(int i = 0; i < input.length; i++) {
            int currentNumber = Integer.parseInt(input[i]);
            if(currentNumber > max) {
                max = currentNumber;
            }
            
            if(currentNumber < min) {
                min = currentNumber;
            }
        }
        
        String answer = min + " " + max;
        return answer;
    }
}