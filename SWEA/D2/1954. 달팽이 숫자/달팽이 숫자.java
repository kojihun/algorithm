import java.util.Scanner;
import java.util.*;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        int dx[] = {0, 1, 0, -1};
        int dy[] = {1, 0, -1, 0};
        for(int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            
            int[][] arr = new int[N][N];
            boolean[][] visited = new boolean[N][N];
            
            for(int i = 0; i < N; i++) {
            	Arrays.fill(visited[i], false);
            }
            
            int dir = 0;
            int x = 0;
            int y = 0;
            
            for(int i = 1; i <= N * N; i++) {
            	arr[x][y] = i;
                visited[x][y] = true;
                
                int nx = x + dx[dir];
                int ny = y + dy[dir];
                
                if(nx < 0 || ny < 0 || nx >= N || ny >= N || visited[nx][ny]) {
                	dir = (dir + 1) % 4;
                }
                
                x = x + dx[dir];
                y = y + dy[dir];
            }
            
            System.out.println("#" + test_case);
            for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
        }
    }
}