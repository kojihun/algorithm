import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        // 참가자 이름과 그 이름의 등장 횟수를 저장하는 HashMap을 생성합니다.
        HashMap<String, Integer> map = new HashMap<>();
        
        // 참가자 배열에 등장하는 이름들과 그 등장 횟수를 저장합니다.
        for (String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }
        
        // 완주자 배열에 등장하는 이름들의 등장 횟수를 차감합니다.
        for (String c : completion) {
            map.put(c, map.get(c) - 1);
        }
        
        // 등장 횟수가 0보다 큰 이름이 완주하지 못한 선수입니다.
        for (String key : map.keySet()) {
            if (map.get(key) > 0) {
                return key;
            }
        }
        
        // 여기까지 도달한다면 완주하지 못한 선수는 항상 존재하므로, 이 코드는 실행되지 않습니다.
        return null;
    }
}