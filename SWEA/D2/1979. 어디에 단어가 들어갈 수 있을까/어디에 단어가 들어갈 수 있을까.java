import java.util.Scanner;
import java.io.FileInputStream;

class Solution {
    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
        
		for(int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            int K = sc.nextInt();

            int answer = 0;
            int[][] graph = new int[N][N];
			for(int i = 0; i < N; i++) {
            	for(int j = 0; j < N; j++) {
                	graph[i][j] = sc.nextInt();
                }
            }
            
            for(int i = 0; i < N; i++) {
                int colCount = 0;
            	for(int j = 0; j < N; j++) {
                	if(graph[i][j] == 0) {
                    	if(colCount == K) {
                        	answer++;
                        }
                        colCount = 0;
                    }else {
                    	colCount++;
                    }
                }
                
                if(colCount == K) {
                	answer++;
                }
            }
            
            for(int i = 0; i < N; i++) {
            	int rowCount = 0;
                for(int j = 0; j < N; j++) {
                	if(graph[j][i] == 0) {
                    	if(rowCount == K) {
                        	answer++;
                        }
                        rowCount = 0;
                    }else {
                    	rowCount++;
                    }
                }
                
                if(rowCount == K) {
                	answer++;
                }
            }
            
            System.out.println("#" + test_case + " " + answer);
		}
	}
}