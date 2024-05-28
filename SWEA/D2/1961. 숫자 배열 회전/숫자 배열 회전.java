import java.util.Scanner;
import java.io.FileInputStream;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
        
		for(int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            
            // Default Value Setting
            int[][] matrix = new int[N][N];
            for(int i = 0; i < N; i++) {
            	for(int j = 0; j < N; j++) {
                	matrix[i][j] = sc.nextInt();
                }
            }
            
            // 90
            String[] temp1 = new String[N];
            for(int i = 0; i < N; i++) {
                StringBuilder sb = new StringBuilder();
            	for(int j = N - 1; j >= 0; j--) {
                	sb.append(matrix[j][i]);
                }
                temp1[i] = sb.toString();
            }
            
            // 180
            String[] temp2 = new String[N];
            int index = 0;
            for(int i = N - 1; i >= 0; i--) {
                StringBuilder sb = new StringBuilder();
            	for(int j = N - 1; j >= 0; j--) {
                	sb.append(matrix[i][j]);
                }
                temp2[index] = sb.toString();
                index++;
            }
            
            // 270
            String[] temp3 = new String[N];
            index = 0;
            for(int i = N - 1; i >= 0; i--) {
                StringBuilder sb = new StringBuilder();
            	for(int j = 0; j < N; j++) {
                	sb.append(matrix[j][i]);
                }
                temp3[index] = sb.toString();
                index++;
            }
            
            // Print Values
            System.out.println("#" + test_case);
            for(int i = 0; i < N; i++) {
            	System.out.println(temp1[i] + " " + temp2[i] + " " + temp3[i]);
            }
		}
	}
}