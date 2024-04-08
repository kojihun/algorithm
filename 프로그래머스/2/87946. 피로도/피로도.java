class Solution {
    public static int maxEntree = Integer.MIN_VALUE;
    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        BFS(k, dungeons, visited, 0);
        return maxEntree;
    }
    
    public static void BFS(int k, int[][] dungeons, boolean[] visited, int depth) {
        if(depth > maxEntree && depth != 0) {
            maxEntree = depth;
        }
        
        for(int i = 0; i < dungeons.length; i++) {
            int minFatigue = dungeons[i][0];
            int wasteFatigue = dungeons[i][1];
            
            if(k >= minFatigue && k >= wasteFatigue && !visited[i]) {
                visited[i] = true;
                BFS(k - wasteFatigue, dungeons, visited, depth + 1);
                visited[i] = false;
            }
        }
    }
}