import java.io.*;
import java.util.*;

class Main {
  public static int count;
  public static int input;
  public static List<Node> list;
  public static void main(String args[]) throws Exception{ 
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 테스트케이스 T
    int T = Integer.parseInt(br.readLine());

    // 결과 값을 담을 StringBuilder
    StringBuilder sb = new StringBuilder();

    // T만큼 반복문을 수행
    for(int i = 0; i < T; i++) {
      // input, count, list초기화
      input = Integer.parseInt(br.readLine());
      list = new ArrayList<>();
      count = 0;
      
      // 새로운 Node를 생성하고, calSum메서드 호출
      Node node = new Node(0, 0, 0, 0);
      calSum(node);

      // 결과 값 StringBuilder에 append
      sb.append(list.size()).append("\n");
    }

    // 결과 값 출력
    System.out.println(sb);
  }

  // 합을 계산하는 메서드
  public static void calSum(Node node) {
    // 입력받은 값과 합이 동일해 질 경우 
    if(node.sum == input) {
      for(int i = 0; i < list.size(); i++) {
        Node temp = list.get(i);
        if(temp.one == node.one && temp.two == node.two && temp.three == node.three) {
          return;
        }
      }
      // 그 외의 경우 리스트에 추가
      list.add(node);
    }else if(node.sum > input) {
      return;
    }
    
    // 1 or 2 or 3을 더하는 과정을 재귀 호출
    for(int i = 1; i <= 3; i++) {
      if(i == 1) {
        calSum(new Node(node.one + 1, node.two, node.three, node.sum + 1));
      }else if(i == 2) {
        calSum(new Node(node.one, node.two + 1, node.three, node.sum + 2));
      }else if(i == 3) {
        calSum(new Node(node.one, node.two, node.three + 1, node.sum + 3));    
      }
    }
  }
}

class Node {
  int one;
  int two;
  int three;
  int sum;

  // 생성자
  public Node(int one, int two, int three, int sum) {
    this.one = one;
    this.two = two;
    this.three = three;
    this.sum = sum;
  }

  public String toString() {
    return "one:" + one + " two:" + two + " three:" + three + " sum:" + sum;
  }
}
