import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        Map<String, Integer> xMap = new HashMap<>();
        Map<String, Integer> yMap = new HashMap<>();
        
        String[] xInput = X.split("");
        for(int i = 0; i < xInput.length; i++) {
            xMap.put(xInput[i], xMap.getOrDefault(xInput[i], 0) + 1);
        }
        
        String[] yInput = Y.split("");
        for(int i = 0; i < yInput.length; i++) {
            yMap.put(yInput[i], yMap.getOrDefault(yInput[i], 0) + 1);
        }
        
        System.out.println(xMap);
        System.out.println(yMap);
        
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : xMap.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            
            if(yMap.containsKey(key)) {
                int count = 0;
                if(value > yMap.get(key)) {
                    count = yMap.get(key);
                }else {
                    count = value;
                }
                
                for(int i = 0; i < count; i++) {
                    list.add(key);
                }
            }
        }
        
        if(list.size() == 0) {
            list.add("-1");
        }
        
        Collections.sort(list);
        
        StringBuilder sb = new StringBuilder();
        for(int i = list.size() - 1; i >= 0; i--) {
            sb.append(list.get(i));
        }
        
        String answer = sb.toString();
        return answer.charAt(0) == '0' ? "0" : answer;
    }
}