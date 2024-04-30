import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        int total = s.length();
        for(int i = 0; i < total; i++) {
            s = s.substring(1) + s.substring(0, 1);
            
            boolean flag = isPair(s);
            if(flag) {
                answer++;
            }
        }
        
        return answer;
    }
    
    private boolean isPair(String s) {
        Stack<Character> stack = new Stack();
        boolean isPair = false;
        
        char[] input = s.toCharArray();
        for(int i = 0; i < input.length; i++) {
            if(input[i] == '[' || input[i] == '(' || input[i] == '{') {
                stack.push(input[i]);
            }else {
                if(!stack.isEmpty() && stack.peek() == '[' && input[i] == ']') {
                    stack.pop();
                    isPair = true;
                    continue;
                }
                
                if(!stack.isEmpty() && stack.peek() == '(' && input[i] == ')') {
                    stack.pop();
                    isPair = true;
                    continue;
                }
                
                if(!stack.isEmpty() && stack.peek() == '{' && input[i] == '}') {
                    stack.pop();
                    isPair = true;
                    continue;
                }
                
                isPair = false;
            }
        }
        
        if(!stack.isEmpty() || !isPair) {
            isPair = false;
        }
        
        return isPair;
    }
}