import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] failureRate = new double[N];

        for (int i = 0; i < N; i++) {
            int reachedCount = 0;
            int notClearedCount = 0;
            for (int j = 0; j < stages.length; j++) {
                if (stages[j] >= i + 1) {
                    reachedCount++;
                    if (stages[j] == i + 1) {
                        notClearedCount++;
                    }
                }
            }
            if (reachedCount == 0) {
                failureRate[i] = 0;
            } else {
                failureRate[i] = (double) notClearedCount / reachedCount;
            }
        }

        for (int i = 0; i < N; i++) {
            double maxFailureRate = -1;
            int maxIndex = -1;
            for (int j = 0; j < N; j++) {
                if (failureRate[j] > maxFailureRate) {
                    maxFailureRate = failureRate[j];
                    maxIndex = j;
                }
            }
            answer[i] = maxIndex + 1;
            failureRate[maxIndex] = -1;
        }

        return answer;
    }
}
