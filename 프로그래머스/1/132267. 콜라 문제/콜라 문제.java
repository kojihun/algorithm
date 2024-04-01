class Solution {
    public int solution(int a, int b, int n) {
        int takeCoke = a;
        int receivedCoke = 0;
        int remainCoke = n;

        int answer = 0;
        while (remainCoke >= a) {
            takeCoke = remainCoke / a;
            receivedCoke = takeCoke * b;
            remainCoke = receivedCoke + (remainCoke % a);
            answer += receivedCoke;
        }
        return answer;
    }
}
