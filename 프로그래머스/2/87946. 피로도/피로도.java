class Solution {
    public static int answer = 0;
    public int solution(int k, int[][] dungeons) {
        // 1. 백트레킹을 위한 변수 선언
        boolean[] visited = new boolean[dungeons.length];
        
        // 2. DFS 메서드 호출
        DFS(dungeons, k, visited, 0);
        
        // 3. 결과 리턴
        return answer;
    }
    
    public static void DFS(int[][] dungeons, int k, boolean[] visited, int depth) {
        answer = Math.max(answer, depth);
        
        // 2. 던전의 크기만큼 반복문 순회
        for(int i = 0; i < dungeons.length; i++) {
            // 3. 해당 던전에 방문하지 않았을 경우
            if(!visited[i] && dungeons[i][0] <= k) {
                visited[i] = true;
                DFS(dungeons, k - dungeons[i][1], visited, depth + 1);
                visited[i] = false;
            }
        }
    }
}