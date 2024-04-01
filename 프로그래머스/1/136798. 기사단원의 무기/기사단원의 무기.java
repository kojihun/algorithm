class Solution {
    public int solution(int number, int limit, int power) {
        int totalScore = 0;
        
        // 각 숫자의 약수 개수를 미리 계산하여 배열에 저장
        int[] divisorCounts = new int[number + 1];
        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= number; j += i) {
                divisorCounts[j]++;
            }
        }
        
        // 약수 개수를 이용하여 결과 계산
        for (int i = 1; i <= number; i++) {
            if (divisorCounts[i] > limit) {
                totalScore += power;
            } else {
                totalScore += divisorCounts[i];
            }
        }
        
        return totalScore;
    }
}
