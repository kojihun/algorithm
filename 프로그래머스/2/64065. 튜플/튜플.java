import java.util.*;

class Solution {
    public int[] solution(String s) {
        s = s.replace("},{", "/");
        s = s.replace("{{", "");
        s = s.replace("}}", "");
        
        Map<Integer, Integer> map = new HashMap<>();


        String[] input = s.split("/");
        for(int i = 0; i < input.length; i++) {
            String[] temp = input[i].split(",");
            for(int j = 0; j < temp.length; j++) {
                map.put(Integer.parseInt(temp[j]), map.getOrDefault(Integer.parseInt(temp[j]), 0) + 1);
            }
        }
        
        int[] answer = new int[input.length];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " " + value);
            answer[value - 1] = key;
        }
        
        int[] reversedArray = new int[answer.length];

        for (int i = 0; i < answer.length; i++) {
            reversedArray[i] = answer[answer.length - 1 - i];
        }
        
        return reversedArray;
    }
}