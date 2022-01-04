import java.io.*;
import java.util.*;

class Main {
  public static int N;
  public static int M;
  public static int[][] map;
  public static boolean[][] visited;
  public static int[] px = {0, 1, 0 ,-1};
  public static int[] py = {1, 0, -1, 0};
  public static int maxValue = 0;
  public static void main(String args[]) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // N, M, K
    String[] input = br.readLine().split(" ");
    N = Integer.parseInt(input[0]);
    M = Integer.parseInt(input[1]);
    int K = Integer.parseInt(input[2]);

    // map, visited
    map = new int[N][M];
    visited = new boolean[N][M];

    // 음식물의 위치를 1이라 가정
    for(int i = 0; i < K; i++) {
      // 음식물의 좌표를 입력받는다.
      String[] temp = br.readLine().split(" ");

      // 음식물이 있는 위치를 1로 저장
      int posX = Integer.parseInt(temp[0])-1;
      int posY = Integer.parseInt(temp[1])-1;
      map[posX][posY] = 1;
    }

    for(int i = 0; i < N; i++) {
      for(int j = 0; j < M; j++) {
        int curCount = 0;

        // (i, j)에 방문하지 않았다면 BFS호출
        if(!visited[i][j] && map[i][j] == 1) {
          // BFS후 결과 음식물 크기값을 afterCount에 저장
          int afterCount = BFS(i, j, curCount);
          
          // 최댓값 갱신
          if(afterCount > maxValue) {
            maxValue = afterCount;
          }
        }
      }
    }

    // 결과 값 출력
    System.out.println(maxValue);
  }

  public static int BFS(int x, int y, int count) {
    // Node타입 큐 선언
    Queue<Node> queue = new LinkedList<>();

    // 최초 시작 지점 값 저장 및 방문처리
    Node node = new Node(x, y);
    queue.offer(node);
    visited[x][y] = true;

    while(!queue.isEmpty()) {
      // 큐에 가장 앞에있는 원소를 추출
      Node temp = queue.poll();
      count++;

      // 동서남북 탐색
      for(int i = 0; i < 4; i++) {
        int nx = temp.x + px[i];
        int ny = temp.y + py[i];

        // 범위 계산
        if(nx >= 0 && ny >= 0 && nx < N && ny < M) {
          // 방문하지 않고 음식물일 경우
          if(!visited[nx][ny] && map[nx][ny] == 1) {
            queue.offer(new Node(nx, ny));
            visited[nx][ny] = true;
          }
        }
      }
    }
    // 결과 값 리턴
    return count;
  }
}

class Node {
  // 좌표 값
  int x;
  int y;

  // 생성자
  public Node(int x, int y) {
    this.x = x;
    this.y = y;
  }
}
