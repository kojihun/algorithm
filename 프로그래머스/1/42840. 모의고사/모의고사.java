import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] persons = new int[3];
        int[] person1 = {1, 2, 3, 4, 5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int maxCount = Integer.MIN_VALUE;
        for(int i = 0; i < answers.length; i++) {
            int answer = answers[i];
            if(answer == person1[i % person1.length]) {
                persons[0]++;
                if(maxCount < persons[0]) {
                    maxCount = persons[0];
                }
            }
            
            if(answer == person2[i % person2.length]) {
                persons[1]++;
                if(maxCount < persons[1]) {
                    maxCount = persons[1];
                }
            }
            
            if(answer == person3[i % person3.length]) {
                persons[2]++;
                if(maxCount < persons[2]) {
                    maxCount = persons[2];
                }
            }
        }
        
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < persons.length; i++) {
            if(persons[i] == maxCount) {
                list.add(i + 1);
            }
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}