import java.util.Arrays;

class Solution {
    public int solution(int[] A, int[] B) {
        // 1. A배열은 오름차순, B배열은 내림차순으로 정렬한다.
        Arrays.sort(A);
        Arrays.sort(B);
        
        // 2. 배열을 순회하며 곱한 값을 answer에 더한다.
        int answer = 0;
        int index = B.length - 1;
        for(int i = 0; i < A.length; i++) {
            answer += A[i] * B[index--];
        }
        
        // 3. 결과 값 리턴
        return answer;
    }
}