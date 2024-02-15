import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        // 1. Map<Integer, Integer>의 형태로 위치까지 저장하면 어떨까? -> 두 개의 큐가 필요
        Queue<Map<Integer, Integer>> beforeQueue = new LinkedList<>();
        Queue<Map<Integer, Integer>> afterQueue = new LinkedList<>();
        
        // 2. 반복문을 순회하며 현재의 값을 큐에 넣자!
        for(int i = 0; i < priorities.length; i++) {
            // 현재 원소와 위치 정보를 저장하자.
            beforeQueue.offer(new HashMap<>(Map.of(priorities[i], i)));
        }
        
        // 3. priorities 배열을 정렬하자.
        int index = priorities.length - 1;
        Arrays.sort(priorities);
        
        // 4. beforeQueue가 비어있을 때까지 반복 순회하자.
        while(!beforeQueue.isEmpty()) {
            Map<Integer, Integer> currentMap = beforeQueue.poll();
            int currentKey = currentMap.keySet().iterator().next();
            
            // 현재 키와 최댓값이 같다면
            if(currentKey == priorities[index]) {
                afterQueue.offer(currentMap);
                index--;
            }
            // 다를 경우 다시 Queue에 넣는다.
            else {
                beforeQueue.offer(currentMap);
            }
        }
        
        // 5. afterQueue를 반복 순회하며 결과를 찾는다.
        int answer = -1;
        for(int i = 0; i < afterQueue.size(); i++) {
            Map<Integer, Integer> map = afterQueue.poll();
            int currentValue = map.entrySet().iterator().next().getValue();
            if(location == currentValue) {
                answer = i + 1;
            }
            afterQueue.offer(map);
        }

        return answer;
        
    }
}