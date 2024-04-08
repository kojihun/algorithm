import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        
        for (int work : works) {
            pq.offer(work);
        }
        
        while (n > 0) {
            int maxWork = pq.poll();
            if (maxWork == 0) break; // 모든 작업량을 소진한 경우 종료
            
            maxWork--; // 가장 큰 작업량을 1만큼 감소
            pq.offer(maxWork); // 감소한 작업량을 다시 큐에 추가
            n--; // 남은 작업량 감소
        }
        
        long answer = 0;
        while (!pq.isEmpty()) {
            int work = pq.poll();
            answer += (long)work * work;
        }
        
        return answer;
    }
}
