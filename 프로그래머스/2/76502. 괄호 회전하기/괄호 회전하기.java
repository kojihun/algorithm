import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (isValid(s))
                answer++;
            s = rotate(s);
        }
        
        return answer;
    }
    
    // 문자열을 회전시키는 함수
    private String rotate(String s) {
        return s.substring(1) + s.charAt(0);
    }
    
    // 올바른 괄호 문자열인지를 체크하는 함수
    private boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{')
                stack.push(c);
            else {
                if (stack.isEmpty())
                    return false;
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{'))
                    return false;
            }
        }
        
        return stack.isEmpty();
    }
}