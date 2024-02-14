import java.util.Stack;

class Solution {
    public int solution(String s) {
        // 1. 스택 선언
        Stack<Character> stack = new Stack<>();
        
        // 2. 문자열을 순회한다.
        for(int i = 0; i < s.length(); i++) {
            // 3. 스택이 비어있지 않고, 스택의 제일 위에있는 원소가 현재 비교할 원소와 동일할 경우 꺼낸다.
            if(!stack.empty() && stack.peek() == s.charAt(i)) {
                stack.pop();
                continue;
            }
            
            // 4. 그렇지 않을 경우 스택에 추가한다.
            stack.add(s.charAt(i));
        }
        
        // 5. 스택에 남아있을 경우 짝이 맞지 않다는 것으로 판단 그 외에는 정답으로 판단.
        if(!stack.empty()) {
            return 0;
        }else {
            return 1;
        }
    }
}