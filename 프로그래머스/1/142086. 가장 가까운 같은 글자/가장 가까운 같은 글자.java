import java.util.*;

class Solution {
    public int[] solution(String s) {
        String[] sArray = s.split("");
        int[] answer = new int[sArray.length];
        answer[0] = -1;
        
        for(int i = 0; i < sArray.length; i++) {
            String curAlphabet = sArray[i];
            boolean flag = false;
            for(int j = i - 1; j >= 0; j--) {
                if(curAlphabet.equals(sArray[j])) {
                    answer[i] = i - j;
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                answer[i] = -1;
            }
        }
        
        return answer;
    }
}