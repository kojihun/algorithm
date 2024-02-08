import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int minValue = Integer.MIN_VALUE;
        int maxValue = Integer.MIN_VALUE;
        
        for(int i = 0; i < sizes.length; i++) {
            Arrays.sort(sizes[i]);        
        }
        
        for(int i = 0; i < sizes.length; i++) {
            if(sizes[i][0] > minValue) {
                minValue = sizes[i][0];
            }
            
            if(sizes[i][1] > maxValue) {
                maxValue = sizes[i][1];
            }
        }
        
        return minValue * maxValue;
    }
    
    public static void print(int[][] sizes) {
        for(int i = 0; i < sizes.length; i++) {
            for(int j = 0; j < sizes[0].length; j++) {
                System.out.print(sizes[i][j] + " ");
            }
            System.out.println();
        }
    }
}