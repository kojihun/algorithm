import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        // 의상의 종류와 해당 종류의 개수를 저장하는 HashMap을 생성합니다.
        HashMap<String, Integer> map = new HashMap<>();
        
        // 의상을 종류별로 분류하고 개수를 세어 HashMap에 저장합니다.
        for (String[] cloth : clothes) {
            String type = cloth[1]; // 의상의 종류를 가져옵니다.
            map.put(type, map.getOrDefault(type, 0) + 1); // 종류별로 개수를 세어 HashMap에 저장합니다.
        }
        
        // 의상을 입는 경우의 수를 계산합니다.
        int answer = 1;
        for (int count : map.values()) {
            answer *= (count + 1); // 해당 종류의 의상을 입지 않는 경우를 포함하여 곱해줍니다.
        }
        
        // 모든 종류의 의상을 입지 않는 경우를 제외합니다.
        answer -= 1;
        
        // 결과를 반환합니다.
        return answer;
    }
}