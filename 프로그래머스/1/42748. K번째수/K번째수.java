import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0; i < commands.length; i++) {
            int[] command = commands[i];
            int start = command[0] - 1;
            int end = command[1];
            int pos = command[2];
            
            List<Integer> list = new ArrayList<>();
            for(int j = start; j < end; j++) {
                list.add(array[j]);
            }
            Collections.sort(list);
            answer[i] = list.get(pos - 1);
        }

        return answer;
    }
}