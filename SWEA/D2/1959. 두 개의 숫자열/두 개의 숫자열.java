import java.util.Scanner;
import java.io.FileInputStream;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
        
		for(int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            
            int[] nArr = new int[N];
            for(int i = 0; i < N; i++) {
            	nArr[i] = sc.nextInt();
            }
            
            int[] mArr = new int[M];
            for(int i = 0; i < M; i++) {
            	mArr[i] = sc.nextInt();
            }
            
            // Sum
            int maxValue = Integer.MIN_VALUE;
            if(M > N) {
                for(int i = 0; i <= (M - N); i++) {
                    int sum = 0;
                    int index = i;
                    for(int j = 0; j < N; j++) {
                        sum += (mArr[index] * nArr[j]);
                        index++;
                    }

                    if(maxValue < sum) {
                        maxValue = sum;
                    }
                }
            }else {
            	for(int i = 0; i <= (N - M); i++) {
                    int sum = 0;
                    int index = i;
                    for(int j = 0; j < M; j++) {
                        sum += (mArr[j] * nArr[index]);
                        index++;
                    }

                    if(maxValue < sum) {
                        maxValue = sum;
                    }
                }
            }
            
            // Print
            System.out.println("#" + test_case + " " + maxValue);
		}
	}
}