import java.util.*;

class Solution {
    public static int[] xways = {1, 0, -1, 0};
    public static int[] yways = {0, 1, 0, -1};
    
    public int solution(int[][] maps) {
        int answer = BFS(maps);
        return answer;
    }
    
    public int BFS(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];
        
        int[] initPos = {0, 0, 1};
        queue.offer(initPos);
        visited[0][0] = true;
        
        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int count = current[2];
            
            if(x == n -1 && y == m -1) {
                return count;
            }
            
            for(int i = 0; i < 4; i++) {
                int nx = x + xways[i];
                int ny = y + yways[i];
                
                if(nx >= 0 && ny >= 0 && nx < n && ny < m) {
                    if(maps[nx][ny] == 1 && !visited[nx][ny]) {
                        int[] newPos = {nx, ny, count + 1};
                        queue.offer(newPos);
                        visited[nx][ny] = true;
                    }
                }
            }
        }
        return -1;
    }
}