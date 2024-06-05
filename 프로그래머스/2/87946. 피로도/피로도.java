class Solution {
    public static int maxCount = Integer.MIN_VALUE;
    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        
        DFS(k, dungeons, visited, 0);
        
        return maxCount;
    }
    
    public static void DFS(int k, int[][] dungeons, boolean[] visited, int count) {
        if(maxCount < count) {
            maxCount = count;
        }
        
        for(int i = 0; i < dungeons.length; i++) {
            int[] dungeon = dungeons[i];
            int stamina = dungeon[0];
            int consume = dungeon[1];
            
            if(!visited[i] && stamina <= k) {
                visited[i] = true;
                DFS(k - consume, dungeons, visited, count + 1);
                visited[i] = false;
            }
        }
    }
}