import java.io.*;
import java.util.*;

class Main {
  public static int N;
  public static int K;
  public static int count;
  public static int min_time = Integer.MAX_VALUE;
  public static boolean[] visited;
  public static int[] calculate = {-1, 1, 2};
  public static void main(String args[]) throws Exception{ 
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // N, K 입력받기
    String[] input = br.readLine().split(" ");
    N = Integer.parseInt(input[0]);
    K = Integer.parseInt(input[1]);

    // 수빈이와 동생의 위치가 같을경우 바로 리턴
    if (N >= K) {
      System.out.println(N - K);
      System.out.println(1);
      return;
    }

    // 방문 체크
    visited = new boolean[100001];

    // BFS메소드 호출
    BFS();

    // 최소시간과 방법의 수 출력
    System.out.println(min_time);
    System.out.println(count);
  }

  public static void BFS() {
    // 정수를 저장하기 위한 큐 선언
    Queue<Node> queue = new LinkedList<>();

    // 수진이의 최초 위치를 큐에 넣고 방문처리를 한다.
    Node node = new Node(N, 0);
    queue.offer(node);
    visited[N] = true;

    // 큐가 비어있지 않았다면 반복수행
    while(!queue.isEmpty()) {
      // 큐에 가장 앞에 있는 원소를 꺼낸다.
      Node cur_pos = queue.poll();
      visited[cur_pos.pos] = true;

      // 현재 수빈이의 위치가 K와 동일할 경우
      if(cur_pos.pos == K) {
        if(min_time >= cur_pos.count) {
          min_time = cur_pos.count;
          count++;
        }else {
          return;
        }
      }

      // 3가지 연산 방법을 모두 적용한다.
      for(int i = 0; i < 3; i++) {
        // X*2연산
        if(i == 2) {
          if(cur_pos.pos * 2 < 100001 && !visited[cur_pos.pos * 2]) {
            Node next_pos = new Node(cur_pos.pos * calculate[i], cur_pos.count + 1);
            queue.offer(next_pos);
          }
        }
            
        // X+1, X-1연산
        else if(i == 1){
          if(cur_pos.pos + 1 < 100001 && !visited[cur_pos.pos + 1]) {
            Node next_pos = new Node(cur_pos.pos + calculate[i], cur_pos.count + 1);
            queue.offer(next_pos);
          }
        }else if(i == 0) {
          if(cur_pos.pos - 1 > 0 && !visited[cur_pos.pos - 1]) {
            Node next_pos = new Node(cur_pos.pos + calculate[i], cur_pos.count + 1);
            queue.offer(next_pos);
          }
        }
      }
    }
  }
}

class Node {
  // pos, count
  int pos;
  int count;

  // 생성자
  public Node(int pos, int count) {
    this.pos = pos;
    this.count = count;
  }
}
