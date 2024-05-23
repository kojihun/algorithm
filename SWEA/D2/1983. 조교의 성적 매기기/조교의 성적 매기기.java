import java.util.Scanner;
import java.util.Arrays;
import java.util.*;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int test_case = 1; test_case <= T; test_case++) {
            int students = sc.nextInt();
            int target = sc.nextInt();
            double targetScore = 0;
            
            double[] scores = new double[students];
            for (int i = 0; i < students; i++) {
                int score1 = sc.nextInt();
                int score2 = sc.nextInt();
                int score3 = sc.nextInt();
                
                double sumScore = (score1 * 0.35) + (score2 * 0.45) + (score3 * 0.2);
                scores[i] = sumScore;
                
                if (i == (target - 1)) {
                    targetScore = sumScore;
                }
            }
            
            Double[] scoresDescending = Arrays.stream(scores).boxed().toArray(Double[]::new);
            Arrays.sort(scoresDescending, Collections.reverseOrder());
            
            int targetRank = Arrays.asList(scoresDescending).indexOf(targetScore);
            
            String[] rateScore = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};
            int rate = students / 10;
            int currentIndex = targetRank / rate;
            
            System.out.println("#" + test_case + " " + rateScore[currentIndex]);
        }
    }
}
