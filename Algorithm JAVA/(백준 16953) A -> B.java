import java.io.*;
import java.util.*;

class Main {
  public static int A;
  public static int B;
  public static int count;
  public static void main(String args[]) throws Exception{ 
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // A, B 값 입력
    String[] input = br.readLine().split(" ");
    A = Integer.parseInt(input[0]);
    B = Integer.parseInt(input[1]);

    // BFS함수 호출
    BFS();
    
    // 결과 값 출력
    System.out.println(count);
  } 

  public static void BFS() {
    // 정수형 큐 선언
    Queue<Integer> queue = new LinkedList<>();

    // 첫 지점 큐에 넣기
    queue.offer(B);
    
    // 큐가 비어있지 않을 경우
    while(!queue.isEmpty()) {
      // 큐에 있는 숫자를 하나 꺼낸다.
      int cur_number = queue.poll();
      count++;

      // 현재 숫자가 A와 동일할 경우 break;
      if(cur_number == A) {
        break;
      }
      // 현재 숫자가 A보다 작을 경우
      else if(cur_number < A) {
        count = -1;
        break;
      }

      // 현재 숫자가 2로 나누어지고, 가장 오른쪽 자리가 1일 경우
      if(cur_number % 2 == 0 || cur_number % 10 == 1) {
        // 2로 나누어지는 경우
        if(cur_number % 2 == 0) {
          int after_number = cur_number / 2;
          queue.offer(after_number);
        }
        // 끝자리 수가 1일 경우
        else if(cur_number % 10 == 1) {
          int after_number = cur_number / 10;
          queue.offer(after_number);
        }
      }else {
        // 만들 수 없는 경우이므로 -1을 count에 대입 후 break
        count = -1;
        break;
      }
    }
  }
}
