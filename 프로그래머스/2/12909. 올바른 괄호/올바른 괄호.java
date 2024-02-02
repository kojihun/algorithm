import java.util.Stack;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>(); 
        char[] brackets = s.toCharArray();

        for (char bracket : brackets) {
            if (bracket == '(') {
                stack.push(bracket);
            } else {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}