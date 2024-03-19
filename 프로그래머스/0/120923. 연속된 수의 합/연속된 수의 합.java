class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        // 초기 값 세팅
        int startNumber = (total / num) - ((num - 1) / 2);
        for(int i = 0; i < num; i++) {
            answer[i] = startNumber;
            startNumber++;
        }
        
        // 결과 값 반환
        return answer;
    }
}