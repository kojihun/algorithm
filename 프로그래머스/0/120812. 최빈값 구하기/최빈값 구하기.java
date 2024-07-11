import java.util.*;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        for(int number : array) {
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }
        
        int maxFrequency = 0;
        int maxFrequencyNumber = -1;
        boolean isMultiple = false;
        
        for(Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int frequency = entry.getValue();
            if(frequency > maxFrequency) {
                maxFrequency = frequency;
                maxFrequencyNumber = entry.getKey();
                isMultiple = false;
            }else if(frequency == maxFrequency) {
                isMultiple = true;
            }
        }
        
        return isMultiple ? -1 : maxFrequencyNumber;
    }
}