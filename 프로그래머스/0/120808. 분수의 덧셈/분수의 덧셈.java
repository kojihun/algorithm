class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int commonDenominator = denom1 * denom2; // 공통 분모 계산
        int newNumer1 = numer1 * denom2; // 첫 번째 분수의 분자 업데이트
        int newNumer2 = numer2 * denom1; // 두 번째 분수의 분자 업데이트
        int sumNumer = newNumer1 + newNumer2; // 분자의 합
        
        int gcd = findGCD(sumNumer, commonDenominator); // 분자와 분모의 최대 공약수 계산
        
        int[] answer = new int[2];
        answer[0] = sumNumer / gcd; // 최대 공약수로 간단화된 분자
        answer[1] = commonDenominator / gcd; // 최대 공약수로 간단화된 분모
        return answer;
    }
    
    // 최대 공약수를 구하는 메서드
    private int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
