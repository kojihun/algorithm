class Solution {
    public int solution(int n) {
        for(int i = 2; i <= 1000000; i++) {
            if(n % i == 1) {
                return i;
            }
        }
        return 0;
    }
}