import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int totalCount = 0;
        
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < want.length; i++) {
            map.put(want[i], number[i]);
            totalCount += number[i];
        }
        
        Map<String, Integer> initMap = new HashMap<>(map);
        for(int i = 0; i < discount.length - (totalCount - 1); i++) {
            for(int j = i; j < i + totalCount; j++) {
                if(!map.containsKey(discount[j])) {
                    break;
                }         
                map.put(discount[j], map.get(discount[j]) - 1);
            }
            if(isPossible(map)) {
                answer++;
            }
            map = new HashMap<>(initMap);
        }
        
        return answer;
    }
    
    public static boolean isPossible(Map<String, Integer> map) {
        Collection<Integer> values = map.values();
        for (Integer value : values) {
            if(value != 0) {
                return false;
            }
        }
        
        return true;
    }
}