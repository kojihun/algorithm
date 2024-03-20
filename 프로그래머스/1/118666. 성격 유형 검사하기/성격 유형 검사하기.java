import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<Integer, Integer> scores = new HashMap<>();
        scores.put(1, 3);
        scores.put(2, 2);
        scores.put(3, 1);
        scores.put(4, 0);
        scores.put(5, 1);
        scores.put(6, 2);
        scores.put(7, 3);
        
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < survey.length; i++) {
            char[] input = survey[i].toCharArray();
            int choice = choices[i];
            
            if(choice < 4) {
                map.put(input[0], map.getOrDefault(input[0], 0) + scores.get(choice));                
            } else if(choice > 4) {
                map.put(input[1], map.getOrDefault(input[1], 0) + scores.get(choice));
            }
        }
        
        return new StringBuilder()
            .append(map.getOrDefault('R', 0) >= map.getOrDefault('T', 0) ? 'R' : 'T')
            .append(map.getOrDefault('C', 0) >= map.getOrDefault('F', 0) ? 'C' : 'F')
            .append(map.getOrDefault('J', 0) >= map.getOrDefault('M', 0) ? 'J' : 'M')
            .append(map.getOrDefault('A', 0) >= map.getOrDefault('N', 0) ? 'A' : 'N')
            .toString();
    }
}