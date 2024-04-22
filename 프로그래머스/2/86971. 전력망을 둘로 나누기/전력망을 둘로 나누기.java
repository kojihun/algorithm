import java.util.*;

class Solution {
    public static int[][] graph;
    public int solution(int n, int[][] wires) {
        graph = new int[n + 1][n + 1];
        for(int i = 0; i < wires.length; i++) {
            int from = wires[i][0];
            int to = wires[i][1];
            
            graph[from][to] = 1;
            graph[to][from] = 1;
        }
        
        int answer = n;
        for(int i = 0; i < wires.length; i++) {
            int from = wires[i][0];
            int to = wires[i][1];
            
            graph[from][to] = 0;
            graph[to][from] = 0;
            
            answer = Math.min(answer, BFS(n, from));
            
            graph[from][to] = 1;
            graph[to][from] = 1;
        }
        
        return answer;
    }
    
    public static int BFS(int n, int x) {
        boolean[] visited = new boolean[n + 1];
        
        Queue<Integer> queue = new LinkedList<>();
        visited[x] = true;
        queue.offer(x);
        
        int count = 1;
        while(!queue.isEmpty()) {
            int temp = queue.poll();
            for(int i = 1; i <= n; i++) {
                if(graph[temp][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.offer(i);
                    count++;
                }
            }
        }
        
        return (int)Math.abs(count - (n - count));
    }
}