import java.util.*;

class Solution {
    public int solution(int n, int[][] costs) {
        // 비용순으로 간선을 정렬하기 위한 Comparator
        Arrays.sort(costs, (a, b) -> a[2] - b[2]);
        
        // 부모 노드를 저장하기 위한 배열
        int[] parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
        
        int answer = 0;
        int connectedEdges = 0;
        // 간선을 하나씩 탐색하면서 최소 신장 트리를 구성
        for (int i = 0; i < costs.length; i++) {
            int[] edge = costs[i];
            int node1 = edge[0];
            int node2 = edge[1];
            int cost = edge[2];
            
            // 두 노드가 같은 집합에 속해있지 않다면(사이클을 형성하지 않는다면) 연결
            if (find(parent, node1) != find(parent, node2)) {
                union(parent, node1, node2);
                answer += cost;
                connectedEdges++;
                // 모든 노드가 연결되었으면 종료
                if (connectedEdges == n - 1) {
                    break;
                }
            }
        }
        
        return answer;
    }
    
    // 노드의 부모 노드를 찾는 메서드
    private int find(int[] parent, int node) {
        if (parent[node] != node) {
            parent[node] = find(parent, parent[node]);
        }
        return parent[node];
    }
    
    // 두 노드를 합치는 메서드
    private void union(int[] parent, int node1, int node2) {
        int root1 = find(parent, node1);
        int root2 = find(parent, node2);
        if (root1 != root2) {
            parent[root2] = root1;
        }
    }
}
