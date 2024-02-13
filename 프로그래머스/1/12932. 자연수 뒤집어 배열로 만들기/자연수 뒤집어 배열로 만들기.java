class Solution {
    public int[] solution(long n) {
        String[] input = String.valueOf(n).split("");
        int[] answer = new int[input.length];
        int index = input.length - 1;
        for(int i = 0; i < input.length; i++) {
            answer[i] = Integer.parseInt(input[index]);
            index--;
        }
        return answer;
    }
}