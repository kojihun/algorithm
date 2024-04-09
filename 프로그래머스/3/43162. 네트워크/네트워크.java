class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[computers.length];
        
        for(int i = 0; i < computers.length; i++){
            if(visited[i] == false){
                answer++;
                DFS(i, visited, computers);
            }            
        }
        
        return answer;
    }
    
    public void DFS(int node, boolean[] visited, int[][] computers){
        visited[node] = true;
        
        for(int i = 0; i < computers.length; i++){
            if(visited[i] == false && computers[node][i] == 1){
                DFS(i, visited, computers);
            }
        }
    }
}