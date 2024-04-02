import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < keymap.length; i++) {
            String[] input = keymap[i].split("");
            for(int j = 0; j < input.length; j++) {
                if(!map.containsKey(input[j])) {
                    map.put(input[j], j + 1);
                }else {
                    int order = map.get(input[j]);
                    if(order > j) {
                        map.put(input[j], j + 1);
                    }
                }
            }
        }
        
        int[] answer = new int[targets.length];
        for(int i = 0; i < targets.length; i++) {
            String[] input = targets[i].split("");
            for(int j = 0; j < input.length; j++) {
                if(map.containsKey(input[j])) {
                    answer[i] += map.get(input[j]);
                }else {
                    answer[i] = -1;
                    break;
                }
            }
        }
        
        return answer;
    }
}