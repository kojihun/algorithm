import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>(); // 주식의 인덱스를 저장할 스택

        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) { // 현재 주식의 가격이 이전 주식의 가격보다 작을 때
                int idx = stack.pop(); // 스택에서 이전 주식의 인덱스를 꺼냄
                answer[idx] = i - idx; // 주식이 가격이 떨어진 시간을 계산하여 저장
            }
            stack.push(i); // 현재 주식의 인덱스를 스택에 추가
        }

        // 주식이 가격이 떨어지지 않은 시간을 계산하기 위해 스택에 남아있는 주식의 인덱스를 처리
        while (!stack.isEmpty()) {
            int idx = stack.pop();
            answer[idx] = prices.length - idx - 1;
        }

        return answer;
    }
}
