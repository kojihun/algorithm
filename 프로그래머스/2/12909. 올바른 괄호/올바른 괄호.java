import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        // 1. 문자 단위로 쪼개기
        char[] input = s.toCharArray();
        
        // 2. 열린 괄호일 경우 스택에 추가
        Stack<Character> stack = new Stack<>();
        for(char c : input) {
            if(c == '(') {
                stack.push(c);
            }else {
                if(!stack.empty() && stack.peek() == '(') {
                    stack.pop();
                }else {
                    answer = false;
                    break;
                }
            }
        }
        
        // 3. 결과 값 반환
        if(!stack.empty()) {
            answer = false;
        }
        
        return answer;
    }
}