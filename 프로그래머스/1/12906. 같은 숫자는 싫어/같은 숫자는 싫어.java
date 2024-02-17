import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        // 1. 중복된 수를 거르기 위한 리스트 선언.
        List<Integer> list = new ArrayList<>();
        
        // 2. 매개변수로 들어온 배열에 대해 반복 순회.
        int index = -1;
        for(int i = 0; i < arr.length; i++) {
            // 3. 최초 값 세팅
            if(i == 0) {
                list.add(arr[i]);
                index++;
                continue;
            }
            
            // 4. 그 이후 로직
            if(list.get(index) != arr[i]) {
                list.add(arr[i]);
                index++;
            }
        }
        
        // 5. 리스트를 배열로 변환
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}