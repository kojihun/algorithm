import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        Set<String> set = new HashSet<>();
        set.add(words[0]);
        
        for(int i = 0; i < words.length - 1; i++) {
            char lastChar = words[i].charAt(words[i].length() - 1);
            char firstChar = words[i + 1].charAt(0);
            
            if(!set.contains(words[i + 1])) {
                set.add(words[i + 1]);
            }else {
                answer[0] = (i + 2) % n == 0 ? n : (i + 2) % n;
                answer[1] = (i + 2) % n == 0 ? (i + 2) / n : (i + 2) / n + 1;
                return answer;
            }
            
            if(lastChar != firstChar) {
                answer[0] = (i + 2) % n == 0 ? n : (i + 2) % n;
                answer[1] = (i + 2) % n == 0 ? (i + 2) / n : (i + 2) / n + 1;
                return answer;
            }
        }
        
        return answer;
    }
}