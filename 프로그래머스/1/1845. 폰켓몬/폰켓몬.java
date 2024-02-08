import java.util.*;

class Solution {
    public int solution(int[] nums) {
        // HashSet을 사용하여 중복된 숫자를 제거하고 유일한 숫자들을 저장합니다.
        HashSet<Integer> set = new HashSet<>();
        
        // 중복된 숫자를 제거하고 유일한 숫자들을 HashSet에 추가합니다.
        for (int num : nums) {
            set.add(num);
        }
        
        // 최대로 선택할 수 있는 폰켓몬의 종류 수는 전체 폰켓몬 수의 반 또는 폰켓몬의 종류 수 중 작은 값입니다.
        int maxSelect = nums.length / 2;
        int uniqueNums = set.size();
        
        // 만약 폰켓몬의 종류 수가 최대 선택 가능 수보다 작다면, 폰켓몬의 종류 수를 선택할 수 있습니다.
        if (uniqueNums <= maxSelect) {
            return uniqueNums;
        } else {
            // 그렇지 않다면, 최대 선택 가능 수를 반환합니다.
            return maxSelect;
        }
    }
}