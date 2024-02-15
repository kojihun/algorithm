import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] clothes = new int[n];
        Arrays.fill(clothes, 1); // 모든 학생은 체육복 1벌을 가짐
        
        // 체육복을 잃어버린 학생 처리
        for (int l : lost) {
            clothes[l - 1]--;
        }
        
        // 여벌의 체육복을 가진 학생 처리
        for (int r : reserve) {
            clothes[r - 1]++;
        }
        
        // 체육복 빌려주기
        for (int i = 0; i < clothes.length; i++) {
            if (clothes[i] == 0) {
                if (i - 1 >= 0 && clothes[i - 1] == 2) { // 왼쪽 학생이 여분이 있는 경우
                    clothes[i]++;
                    clothes[i - 1]--;
                } else if (i + 1 < clothes.length && clothes[i + 1] == 2) { // 오른쪽 학생이 여분이 있는 경우
                    clothes[i]++;
                    clothes[i + 1]--;
                }
            }
        }
        
        // 체육복을 가진 학생 수 세기
        int answer = 0;
        for (int c : clothes) {
            if (c > 0) {
                answer++;
            }
        }
        
        return answer;
    }
}
