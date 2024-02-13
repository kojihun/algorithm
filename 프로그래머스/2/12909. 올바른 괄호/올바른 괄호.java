import java.util.Stack;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else {
                // ')'일 때 스택에서 '('를 제거하며 검사
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    // 스택이 비어있거나 pop할 '('이 없는 경우 올바른 괄호 문자열이 아니므로 false 반환
                    return false;
                }
            }
        }
        
        // 모든 문자를 확인한 후 스택이 비어있다면 올바른 괄호 문자열이므로 true 반환
        return stack.isEmpty();
    }
}
