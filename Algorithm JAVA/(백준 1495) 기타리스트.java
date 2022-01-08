import java.io.*;
import java.util.*;

class Main {
  public static int N, S, M;
  public static int[] array;
  public static void main(String args[]) throws Exception{ 
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // N, S, M
    String[] input = br.readLine().split(" ");
    N = Integer.parseInt(input[0]);
    S = Integer.parseInt(input[1]);
    M = Integer.parseInt(input[2]);

    // array[값] = 깊이 구조의 배열 선언 및 -1로 초기화
    array = new int[M+1];
    for(int i = 0; i <= M; i++) {
      array[i] = -1;
    }

    // 초기 값 설정
    array[S] = 0;

    // 더하거나 뺄 값 받고, 반복문 수행
    String[] temp = br.readLine().split(" ");
    for(int i = 1; i <= N; i++) {
      // 값을 꺼내고 value에 저장
      int value = Integer.parseInt(temp[i-1]);

      // 리스트 선언
      List<Integer> list = new ArrayList<>();

      // M번 만큼 반복 수행
      for(int j = 0; j <= M; j++) {
        if(array[j] == i-1) {
          int result1 = j + value;
          int result2 = j - value;

          // 각 범위안에 들 경우 리스트에 추가
          if(0 <= result1 && result1 <= M) {
            list.add(result1);  
          }
          
          if(0 <= result2 && result2 <= M) {
            list.add(result2);
          }
        }
      }
      // 리스트를 순회하며
      for(int n : list) {
        array[n] = i;
      }
    }

    int MAX = -1;
    // 값이 3인 것중 인덱스가 가장 높은 것을 찾아 MAX값에 저장
    for(int i = 0; i < array.length; i++) {
      if(array[i] == N) {
        MAX = Math.max(MAX, i);
      }
    }

    // 결과 값 출력
    System.out.println(MAX);
  } 
}
