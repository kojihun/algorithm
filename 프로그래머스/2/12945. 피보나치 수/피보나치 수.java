class Solution {
    public long solution(int n) {
        // 1. 피보나치 수를 저장할 배열 선언
        long[] fibonacci = new long[100001];
        
        // 2. 0과 1은 초기화 필요
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        
        // 3. 반복문을 순회하며 n지점까지의 값을 찾음
        for(int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = (fibonacci[i - 2] + fibonacci[i - 1])  % 1234567;
            
            // 4. i가 n이 되는 시점에 break;
            if(i == n) {
                break;
            }
        }
        
        // 5. fibonacci의 n번째 값을 리턴
        return fibonacci[n];
    }
}