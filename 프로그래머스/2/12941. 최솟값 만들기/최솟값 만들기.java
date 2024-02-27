import java.util.*;

class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        
        // 1. A 배열은 오름차순으로 정렬
        Arrays.sort(A);
        
        // 2. B 배열은 내림차순으로 정렬
        Arrays.sort(B);
        
        // 3. 반복문을 순회하며 가장 큰 값과 가장 작은 값을 곱해서 더한다.
        int bIndex = B.length - 1;
        for(int i = 0; i < A.length; i++) {
            answer += A[i] * B[bIndex];
            bIndex--;
        }
        
        // 4. 결과 값 반환
        return answer;
    }
}