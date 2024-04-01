class Solution {
    public int[] solution(long n) {
        String input = String.valueOf(n);
        int[] answer = new int[input.length()];
        
        for (int i = input.length() - 1; i >= 0; i--) {
            char digitChar = input.charAt(i);
            int digit = Character.getNumericValue(digitChar);
            answer[input.length() - 1 - i] = digit;
        }
        
        return answer;
    }
}