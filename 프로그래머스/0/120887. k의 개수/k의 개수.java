class Solution {
    public int solution(int start, int end, int found) {
        int answer = 0;
        
        for(int i = start; i <= end; i++) {
            String[] input = String.valueOf(i).split("");
            
            for(int j = 0; j < input.length; j++) {
                int number = Integer.parseInt(input[j]);
                if(number == found) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}