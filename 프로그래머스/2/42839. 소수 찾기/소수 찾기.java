import java.util.*;

class Solution {
    private HashSet<Integer> set = new HashSet<>();
    
    public int solution(String numbers) {
        char[] nums = numbers.toCharArray();
        boolean[] visited = new boolean[nums.length];
        
        // 백트래킹을 사용하여 가능한 모든 숫자 조합을 생성합니다.
        for (int len = 1; len <= nums.length; len++) {
            permutation(nums, visited, new StringBuilder(), len);
        }
        
        // 생성된 숫자 조합 중 소수인 것의 개수를 세어 반환합니다.
        int answer = 0;
        for (int num : set) {
            if (isPrime(num)) {
                answer++;
            }
        }
        
        return answer;
    }
    
    // 백트래킹을 이용하여 숫자 조합을 생성하는 재귀 함수
    private void permutation(char[] nums, boolean[] visited, StringBuilder sb, int len) {
        if (sb.length() == len) {
            int num = Integer.parseInt(sb.toString());
            set.add(num);
            return;
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                sb.append(nums[i]);
                permutation(nums, visited, sb, len);
                sb.deleteCharAt(sb.length() - 1);
                visited[i] = false;
            }
        }
    }
    
    // 소수 판별 함수
    private boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
