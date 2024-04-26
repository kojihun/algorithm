import java.util.*;

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        // 결과 행렬의 크기 설정
        int[][] answer = new int[arr1.length][arr2[0].length];
        
        // 행렬 곱셈 알고리즘 구현
        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr2[0].length; j++) {
                int sum = 0;
                for(int k = 0; k < arr1[0].length; k++) {
                    sum += arr1[i][k] * arr2[k][j];
                }
                answer[i][j] = sum;
            }
        }
        
        return answer;
    }
}
