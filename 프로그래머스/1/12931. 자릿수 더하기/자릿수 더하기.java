import java.util.*;

public class Solution {
    public int solution(int n) {
        String temp = String.valueOf(n);
        String[] input = temp.split("");
        int answer = 0;
        
        for(int i = 0; i < input.length; i++) {
            answer += Integer.parseInt(input[i]);
        }

        return answer;
    }
}