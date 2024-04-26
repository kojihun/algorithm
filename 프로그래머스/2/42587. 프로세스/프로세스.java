import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0; // 출력 순서를 나타내는 변수
        
        // 우선순위를 저장하는 우선순위 큐 생성 (내림차순으로 정렬)
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        for(int priority : priorities) {
            priorityQueue.offer(priority); // 우선순위 큐에 각 작업의 우선순위 추가
        }
        
        // 우선순위 큐가 비어있지 않은 동안 반복
        while(!priorityQueue.isEmpty()) {
            // 모든 작업에 대해 순회
            for(int i = 0; i < priorities.length; i++) {
                // 우선순위 큐에서 현재 가장 높은 우선순위를 가진 작업과 배열의 작업 비교
                if(priorityQueue.peek() == priorities[i]) {
                    priorityQueue.poll(); // 가장 높은 우선순위를 가진 작업 삭제
                    answer++; // 출력 순서 증가
                    
                    // 현재 작업이 원하는 위치인지 확인
                    if(location == i) {
                        return answer; // 위치와 일치하면 출력 순서 반환 후 종료
                    }
                }
            }
        }
        
        return answer; // 출력 순서 반환
    }
}
