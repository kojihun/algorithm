import java.util.*;

/*
풀이IDEA
1. 문제의 핵심 요지는 가로와 세로를 곱하여 가장 작은 직사각형을 만드는 것
2. 각 행에 대해 정렬을 통해 가로길이는 짧은 것들만 모이게 하고, 세로길이는 긴 것들만 모이게 하자
3. 두 변의 곱을 구하면 최소 직사각형을 구할 수 있다.
*/
class Solution {
    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;
        
        for(int[] size : sizes) {
            Arrays.sort(size);
            
            maxWidth = Math.max(maxWidth, size[0]);
            maxHeight = Math.max(maxHeight, size[1]);
        }
        
        return maxWidth * maxHeight;
    }
}