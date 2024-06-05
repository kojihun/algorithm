import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        for(int i = 0; i < sizes.length; i++) {
            Arrays.sort(sizes[i]);
        }
        
        int maxWidth = Integer.MIN_VALUE;
        int maxHeight = Integer.MIN_VALUE;
        for(int i = 0; i < sizes.length; i++) {
            int[] size = sizes[i];
            maxWidth = size[0] > maxWidth ? size[0] : maxWidth;
            maxHeight = size[1] > maxHeight ? size[1] : maxHeight;
        }
        
        int answer = maxWidth * maxHeight;
        
        return answer;
    }
}