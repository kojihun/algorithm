import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int number : numbers) {
            uniqueNumbers.add(number);
        }
        
        int answer = 0;        
        for (int i = 0; i <= 9; i++) {
            if (!uniqueNumbers.contains(i)) {
                answer += i;
            }
        }
        
        return answer;
    }
}
