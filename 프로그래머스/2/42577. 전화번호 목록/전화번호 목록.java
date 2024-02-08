import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        // 전화번호 목록을 오름차순으로 정렬합니다.
        Arrays.sort(phone_book);
        
        // 인접한 두 번호를 비교하여 접두어 여부를 확인합니다.
        for (int i = 0; i < phone_book.length - 1; i++) {
            // 현재 번호와 다음 번호가 서로의 접두어인지 확인합니다.
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                return false; // 접두어가 발견되면 false를 반환합니다.
            }
        }
        
        // 모든 번호가 서로의 접두어가 아니라면 true를 반환합니다.
        return true;
    }
}