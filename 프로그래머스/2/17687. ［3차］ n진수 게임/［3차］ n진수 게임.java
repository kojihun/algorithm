import java.util.*;

class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        
        int len = 0;
        int tube = p;
        
        for(int i = 0; i <= t * m; i++) {
            String tmp = Integer.toString(i, n).toUpperCase();
            for(int j = 0; j < tmp.length(); j++) {
                len++;
                
                if(len == tube) {
                    answer += tmp.substring(j, j + 1);
                    if(answer.length() == t) break;
                    
                    tube += m;
                }
            }
        }
        return answer;
    }
}