import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] rank = {6, 6, 5, 4, 3, 2, 1};
        
        Arrays.sort(lottos);
        Arrays.sort(win_nums);

        int default_win = 0;
        int zeroCount = 0;
        for(int i = 0; i < lottos.length; i++) {
            if(lottos[i] == 0) {
                zeroCount = zeroCount + 1;
                continue;
            }
            
            for(int j = 0; j < win_nums.length; j++) {
                if(lottos[i] == win_nums[j]) {
                    default_win = default_win + 1;
                    continue;
                }    
            }
        }
        
        int[] answer = new int[2];
        answer[0] = rank[default_win + zeroCount];
        answer[1] = rank[default_win];
        return answer;
    }
}