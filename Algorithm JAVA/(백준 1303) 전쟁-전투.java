import java.io.*;
import java.util.*;

class Main {
  public static int[] px = {0, 1, 0, -1};
  public static int[] py = {1, 0, -1, 0};
  public static int N;
  public static int M;
  public static int MyTeam = 0;
  public static int YourTeam = 0;
  public static String[][] MAP;
  public static boolean[][] visited;
  public static void main(String args[]) throws Exception{ 
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // N, M
    String[] input = br.readLine().split(" ");
    N = Integer.parseInt(input[1]);
    M = Integer.parseInt(input[0]);

    // MAP, visited
    MAP = new String[N][M];
    visited = new boolean[N][M];

    for(int i = 0; i < N; i++) {
      String[] temp = br.readLine().split("");
      for(int j = 0; j < temp.length; j++) {
        MAP[i][j] = temp[j];
      }
    }

    for(int i = 0; i < N; i++) {
      for(int j = 0; j < M; j++) {
        int curCount = 0;
        if(!visited[i][j]){
          int count = BFS(i, j, curCount);
          if(MAP[i][j].equals("W")) {
            MyTeam = MyTeam + (count * count);
          }else {
            YourTeam = YourTeam + (count * count);
          }
        }
      }
    }
    
    // 결과 값 출력
    System.out.println(MyTeam + " " + YourTeam);
  }
  
  public static int BFS(int x, int y, int count) {
    // Node타입의 선입선출의 자료구조 큐 선언
    Queue<Node> queue = new LinkedList<>();

    // 첫번째 위치에 존재하는 병사를 큐에 넣고 방문처리를 한다.
    Node node = new Node(x, y);
    queue.offer(node);
    visited[x][y] = true;

    // 큐가 비어있지 않으면 반복수행
    while(!queue.isEmpty()) {
      // 큐에 있는 원소를 꺼낸다.
      Node temp = queue.poll();
      count++;

      // 지도를 돌며 방문하지 않고 아군인 갯수를 샌다. ("동서남북")
      for(int i = 0; i < 4; i++) {
        int nx = temp.x + px[i];
        int ny = temp.y + py[i];

        if(nx >= 0 && ny >= 0 && nx < N && ny < M) {
          if(!visited[nx][ny] && MAP[nx][ny].equals(MAP[temp.x][temp.y])) {
            queue.offer(new Node(nx, ny));
            visited[nx][ny] = true;
          }
        }
      }
    }
    // 병사의 수를 세어 그 값을 리턴
    return count;
  }
}

class Node {
  int x;
  int y;

  public Node(int x, int y) {
    this.x = x;
    this.y = y;
  }
}
