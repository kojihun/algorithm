import java.util.*;

class Solution {
    public static Map<String, Integer> map = new HashMap<>();
    public static int MAX = Integer.MIN_VALUE;
    public String[] solution(String[] orders, int[] course) {
        List<String> answer = new ArrayList<>();
        
        for(int i = 0; i < orders.length; i++) {
            char[] arr = orders[i].toCharArray();
            Arrays.sort(arr);
            orders[i] = String.valueOf(arr);
        }
        
        for(int courseLength : course) {
            for(String order : orders) {
                combination("", order, courseLength);
            }
            
            if(MAX > 1) {
                for(String key : map.keySet()) {
                    if(map.get(key) == MAX) {
                        answer.add(key);
                    }
                }
            }
            MAX = Integer.MIN_VALUE;
            map.clear();
        }
        
        Collections.sort(answer);
        return answer.toArray(new String[answer.size()]);
    }
    
    public void combination(String order, String other, int length) {
        if(length == 0) {
            map.put(order, map.getOrDefault(order, 0) + 1);
            if(MAX < map.get(order)) {
                MAX = map.get(order);
            }
            return;
        }
        
        for(int i = 0; i < other.length(); i++) {
            combination(order + other.charAt(i), other.substring(i + 1), length - 1);
        }
    }
}