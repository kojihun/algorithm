import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        // [0,0,0,0,0]
        // [0,0,1,0,3]
        // [0,2,5,0,1]
        // [4,2,4,4,2]
        // [3,5,1,3,1]
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < moves.length; i++) {
            int move = moves[i] - 1;
            for(int j = 0; j < board.length; j++) {
                if(board[j][move] == 0) {
                    continue;
                }
                
                if(stack.isEmpty()) {
                    stack.push(board[j][move]);
                }else {
                    if(stack.peek() != board[j][move]) {
                        stack.push(board[j][move]);
                    }else {
                        stack.pop();
                        answer += 2;
                    }
                }
                board[j][move] = 0;
                break;
            }
        }
        
        return answer;
    }
}
