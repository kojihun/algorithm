class Solution {
    public static int answer = 0;
    public int solution(long num) {
        int count = 0;
        DFS(num, count);
        
        return answer;
    }
    
    public static void DFS(long number, int count) {
        // 작업이 500번 이상 이루어졌음에도 1이 되지 않는 경우
        if(count > 500) {
            answer = -1;
            return;
        }
        
        // number가 1이 되었으면 count를 리턴한다.
        if(number == 1) {
            answer = count;
            return;
        }
        
        // 입력된 수가 짝수라면 2로 나눈다.
        if(number % 2 == 0) {
            DFS(number / 2, count + 1);
        }
        // 입력된 수가 홀수라면 3을 곱하고 1을 더한다.
        else {
            DFS((number * 3) + 1, count + 1);
        }
    }
}