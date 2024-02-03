import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < progresses.length; i++) {
            int remainPercent = 100 - progresses[i];
            int speed = speeds[i];
            int count = 1;
            
            while(remainPercent > speed * count) {
                count++;
            }
            
            list.add(count);
        }

        List<Integer> result = new ArrayList<>();
        int prev = list.get(0);
        int count = 1;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) <= prev) {
                count++;
            } else {
                result.add(count);
                prev = list.get(i);
                count = 1;
            }
        }
        result.add(count);

        int[] answer = new int[result.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}