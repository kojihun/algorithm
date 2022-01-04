import java.io.*;
import java.util.*;

class Main {
  public static int N;
  public static int M;
  public static int[][] map;
  public static int count = 0;
  public static boolean[][] visited;
  public static int[] px = {0, 1, 0, -1};
  public static int[] py = {-1, 0, 1, 0};
  public static void main(String args[]) throws Exception{ 
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // N, M
    String[] input = br.readLine().split(" ");
    N = Integer.parseInt(input[0]);
    M = Integer.parseInt(input[1]);

    // map, visited
    map = new int[N][M];
    visited = new boolean[N][M];

    // map 데이터 입력
    for(int i = 0; i < N; i++) {
      String[] temp = br.readLine().split("");
      for(int j = 0; j < M; j++) {
        map[i][j] = Integer.parseInt(temp[j]);
      }
    }

    // BFS메소드 호출
    BFS();
  }

  public static void BFS() {
    Queue<Node> queue = new LinkedList<>();

    // 첫 좌표를 저장한 후 방문처리
    Node node = new Node(0, 0, 1);
    queue.offer(node);
    visited[0][0] = true;

    while(!queue.isEmpty()) {
      // 큐에 있는 원소를 꺼낸다.
      Node temp = queue.poll();

      // N,M에 도달할 경우 정지
      if(temp.x == N-1 && temp.y == M-1) {
        System.out.println(temp.count);
        break;
      }

      // 동서남북 방향으로 탐색
      for(int i = 0; i < 4; i++) {
        int nx = temp.x + px[i];
        int ny = temp.y + py[i];

        // 범위 초과 방지 연산
        if(nx >= 0 && ny >= 0 && nx < N && ny < M) {
          // 방문하지 않았고 새로운 위치가 1이면
          if(!visited[nx][ny] && map[nx][ny] == 1) {
            queue.offer(new Node(nx, ny, temp.count + 1));
            visited[nx][ny] = true;
          }
        }
      }
    }
  }
}

class Node {
  // x, y
  int x;
  int y;
  int count;

  // 생성자
  public Node(int x, int y, int count) {
    this.x = x;
    this.y = y;
    this.count = count;
  }
}
