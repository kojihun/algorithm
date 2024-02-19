import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int[] answer = new int[10000001];
        for(int i = 0; i < tangerine.length; i++) {
            answer[tangerine[i]] = answer[tangerine[i]] + 1;
        }
        
        Arrays.sort(answer);
        
        int type = 0;
        for(int i = answer.length - 1; i >= 0; i--) {
            k = k - answer[i];
            type++;
            
            if(k <= 0) {
                break;
            }
        }
        
        return type;
    }
}