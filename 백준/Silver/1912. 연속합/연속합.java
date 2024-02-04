import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 수열의 길이 입력
        int N = scanner.nextInt();

        // 수열의 각 원소를 저장할 배열
        int[] arr = new int[N];

        // 수열의 각 원소 입력
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        // dp 배열 초기화
        int[] dp = new int[N];

        // 첫 번째 원소는 초기값으로 설정
        dp[0] = arr[0];
        int maxSum = dp[0];

        // 점화식을 이용하여 최대 연속합 계산
        for (int i = 1; i < N; i++) {
            dp[i] = Math.max(arr[i], dp[i - 1] + arr[i]);
            maxSum = Math.max(maxSum, dp[i]);
        }

        // 최대 연속합 출력
        System.out.println(maxSum);
    }
}
