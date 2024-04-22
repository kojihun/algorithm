class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int[][] graph = new int[m][n];
        for(int[] puddle : puddles) {
            graph[puddle[0] - 1][puddle[1] - 1] = -1;
        }
        
        graph[0][0] = 1;
        
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(graph[i][j] == -1) {
                    graph[i][j] = 0;
                    continue;
                }
                
                if(i != 0) {
                    graph[i][j] += graph[i - 1][j] % 1000000007;
                }
                
                if(j != 0) {
                    graph[i][j] += graph[i][j - 1] % 1000000007;
                }
            }
        }
        
        return graph[m - 1][n - 1] % 1000000007;
    }
}