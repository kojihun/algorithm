import java.util.*;

class Solution {
    public int solution(int n, int[][] edge) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] e : edge) {
            int u = e[0] - 1, v = e[1] - 1;
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        boolean[] visited = new boolean[n];
        int[] distances = new int[n];

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        visited[0] = true;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int node = queue.poll();
                for (int neighbor : graph.get(node)) {
                    if (!visited[neighbor]) {
                        visited[neighbor] = true;
                        distances[neighbor] = distances[node] + 1;
                        queue.offer(neighbor);
                    }
                }
            }
        }

        int maxDistance = Arrays.stream(distances).max().getAsInt();
        int count = 0;
        for (int distance : distances) {
            if (distance == maxDistance) {
                count++;
            }
        }

        return count;
    }
}