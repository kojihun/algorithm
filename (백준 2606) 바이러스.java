import java.io.*;
import java.util.*;

class Main {
  public static int N;
  public static int M;
  public static int count;
  public static int[][] map;
  public static boolean[] visited;
  public static void main(String args[]) throws Exception { 
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 컴퓨터의 수 N, 연결되어있는 컴퓨터의 쌍 M
    N = Integer.parseInt(br.readLine());
    M = Integer.parseInt(br.readLine());

    // map, visited
    map = new int[N][N];
    visited = new boolean[N];
    
    for(int i = 0; i < M; i++) {
      String[] temp = br.readLine().split(" ");

      // posX, posY
      int posX = Integer.parseInt(temp[0])-1;
      int posY = Integer.parseInt(temp[1])-1;

      // 양방향으로 연결을 표시한다.
      map[posX][posY] = map[posY][posX] = 1;
    }

    // BFS메소드 호출
    BFS(0);
    
    // 결과 값 출력
    System.out.println(count-1);
  }

  public static void BFS(int pos) {
    // 선입선출의 자료구조 큐 선언
    Queue<Integer> queue = new LinkedList<>();

    // 초기 값 저장
    queue.offer(pos);
    visited[pos] = true;

    while(!queue.isEmpty()) {
      int curNode = queue.poll();
      count++;

      for(int i = 0; i < N; i++) {
        if(!visited[i] && map[curNode][i] == 1) {
          queue.offer(i);
          visited[i] = true;
        }
      }
    }
  }
}
