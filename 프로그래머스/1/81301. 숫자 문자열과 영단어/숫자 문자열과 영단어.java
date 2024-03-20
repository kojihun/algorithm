import java.util.*;

class Solution {
    public int solution(String s) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");
        
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            
            s = s.replace(key, value);
        }
        
        return Integer.parseInt(s);
    }
}