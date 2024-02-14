public class Solution {
    public static int solution(int n) {
        // 주어진 숫자의 이진 표현에서 1의 개수를 카운트
        int countOne = Integer.bitCount(n);
        
        // 다음 큰 숫자를 찾을 때까지 1씩 증가하며 조건을 만족하는 숫자 찾기
        int nextNumber = n + 1;
        while (Integer.bitCount(nextNumber) != countOne) {
            nextNumber++;
        }
        
        return nextNumber;
    }

    public static void main(String[] args) {
        int n = 78;
        System.out.println(solution(n)); // 다음 큰 숫자인 83 출력
    }
}
