import java.util.*;
/*
문제IDEA
1번: 1,2,3,4,5
2번: 2,1,2,3,2,4,2,5
3번: 3,3,1,1,2,2,4,4,5,5
*/
class Solution {
    public int[] solution(int[] answers) {
        int[] person1 = {1, 2, 3, 4, 5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] scores = new int[3];
        
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == person1[i % person1.length]) {
                scores[0]++;
            }
            if(answers[i] == person2[i % person2.length]) {
                scores[1]++;
            }
            if(answers[i] == person3[i % person3.length]) {
                scores[2]++;
            }
        }
        
        int maxValue = Math.max(scores[0], Math.max(scores[1], scores[2]));
        
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < scores.length; i++) {
            if(scores[i] == maxValue) {
                list.add(i + 1);
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}