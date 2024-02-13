import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String[] input = String.valueOf(n).split("");
        for(int i = 0; i < input.length; i++) {
            answer += Integer.parseInt(input[i]);
        }
        
        return answer;
    }
}