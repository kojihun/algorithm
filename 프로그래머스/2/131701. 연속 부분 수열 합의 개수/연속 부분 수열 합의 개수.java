import java.util.HashSet;

public class Solution {
    public static int solution(int[] elements) {
        HashSet<Integer> set = new HashSet<>();
        int n = elements.length;

        // 가능한 모든 연속 부분 수열 생성
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += elements[(i + j) % n]; // 원형 수열이므로 인덱스를 n으로 나눈 나머지를 사용
                set.add(sum);
            }
        }

        // 중복 제거 후 가능한 수의 개수 반환
        return set.size();
    }
}
