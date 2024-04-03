class Solution {
    public int solution(int n) {
        int totalCount = 0;
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = i; j <= n; j++) {
                sum += j;
                if (sum == n) {
                    totalCount++;
                    break;
                }
                if (sum > n) {
                    break;
                }
            }
        }
        
        return totalCount;
    }
}