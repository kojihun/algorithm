class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if(isPrime(sum)) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
    
    public static boolean isPrime(int number) {
        if(number <= 1) {
            return false;
        }
        
        for(int i = 2; i * i <= number; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}