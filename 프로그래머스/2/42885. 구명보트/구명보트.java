import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int boat = 0;
        
        // 몸무게 순으로 정렬
        Arrays.sort(people);
        
        // 인덱스 선언
        int firstIndex = 0;
        int lastIndex = people.length - 1;
        
        while(firstIndex <= lastIndex) {
            int person1 = people[firstIndex];
            int person2 = people[lastIndex];
            
            if(person1 + person2 <= limit) {
                firstIndex++;
                lastIndex--;
                boat++;
            }else {
                lastIndex--;
                boat++;
            }
        }
        
        return boat;
    }
}