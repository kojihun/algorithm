import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int index = 1;
        Set<Integer> set = new HashSet<>();
        for(int k = 0; k < elements.length; k++) {
            for(int i = 0; i < elements.length; i++) {
                int number = 0;
                for(int j = i; j < index + i; j++) {
                    number += elements[j % elements.length];
                }
                set.add(number);
            }
            index++;
        }
        
            
        return set.size();
    }
}