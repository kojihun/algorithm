class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String[] input = String.valueOf(order).split("");        
        for(int i = 0; i < input.length; i++) {
            int number = Integer.parseInt(input[i]);
            if(number == 3 || number == 6 || number == 9) {
                answer++;
            }
        }
        
        return answer;
    }
}