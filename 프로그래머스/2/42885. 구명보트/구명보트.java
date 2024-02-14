import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int left = 0;
        int right = people.length - 1;
        int boat = 0;
        
        while(left <= right) {
            int person1 = people[left];
            int person2 = people[right];
            
            if(person1 + person2 <= limit) {
                left++; // 왼쪽 포인터를 오른쪽으로 이동
            }
            right--; // 항상 오른쪽 포인터는 이동해야 함
            boat++;
        }
        
        return boat;
    }
}