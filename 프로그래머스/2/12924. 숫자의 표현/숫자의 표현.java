class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++) {
            int sum = 0;
            for(int j = i; j <= n; j++) {
                sum += j;
                
                // 1. 합산이 n과 같아질 경우
                if(sum == n) {
                    answer++;
                    break;
                }
                
                // 2. 합상니 n보다 클 경우
                if(sum > n) {
                    break;
                }
            }
        }
        return answer;
    }
}