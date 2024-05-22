import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
        
		for(int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            
            int[][] matrix = new int[N][N];
            for(int i = 0; i < N; i++) {
            	for(int j = 0; j < N; j++) {
                	matrix[i][j] = sc.nextInt();
                }
            }
            
            int flyCount = Integer.MIN_VALUE;
            for(int i = 0; i <= N - M; i++) { // 범위 수정: N - M 대신 N - M + 1
            	for(int j = 0; j <= N - M; j++) { // 범위 수정: N - M 대신 N - M + 1
                    
                    int sumCount = 0;
                	for(int k = i; k < i + M; k++) {
                    	for(int q = j; q < j + M; q++) {
                        	sumCount += matrix[k][q];
                        }
                    }
                    
                    if(sumCount > flyCount) {
                    	flyCount = sumCount;
                    }
                }
            }
            
            System.out.println("#" + test_case + " " + flyCount);
		}
	}
}