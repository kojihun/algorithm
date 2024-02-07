import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> answers = new ArrayList<>();
        
        for(int i = 0; i < commands.length; i++) {
            int[] command = commands[i];
            int start = command[0] - 1;
            int end = command[1];
            int target = command[2] - 1;
            
            int[] nArray = Arrays.copyOfRange(array, start, end);
            Arrays.sort(nArray);
            
            answers.add(nArray[target]);
        }
        
        return answers.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}