import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String solution(int[] numbers) {
        // 숫자 배열을 문자열 배열로 변환
        String[] nums = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            nums[i] = String.valueOf(numbers[i]);
        }

        // 문자열을 연결한 결과를 비교하여 정렬
        Arrays.sort(nums, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                String s1s2 = s1 + s2;
                String s2s1 = s2 + s1;
                // 내림차순 정렬
                return s2s1.compareTo(s1s2);
            }
        });

        // 정렬된 숫자들을 연결하여 가장 큰 수를 만듭니다.
        StringBuilder sb = new StringBuilder();
        for (String num : nums) {
            sb.append(num);
        }

        // 예외처리: 모든 숫자가 0인 경우
        if (sb.charAt(0) == '0') {
            return "0";
        }

        return sb.toString();
    }
}
