import java.util.*;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        
        int size = array.length;
        if(size % 2 != 0) {
            return array[size / 2];
        }
        
        return array[(size / 2) - 1];
    }
}