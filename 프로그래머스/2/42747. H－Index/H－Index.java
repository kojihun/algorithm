import java.util.*;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        
        int hIndex = Integer.MIN_VALUE;
        for(int i = 0; i < citations.length; i++) {
            int minCitations = Math.min(citations[i], citations.length - i);
            hIndex = Math.max(hIndex, minCitations);
        }
        
        return hIndex;
    }
}
