import java.util.*;
import java.io.*;

class Main {  
  public static void main(String args[]) throws Exception { 
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // 아홉 난쟁이를 입력받을 배열
    int[] array = new int[9];

    // 아홉 난쟁이의 키를 더한 값
    int sum = 0;

    // 아홉 난쟁이의 키를 입력받는다.
    for(int i = 0; i < array.length; i++) {
      array[i] = Integer.parseInt(br.readLine());
      sum += array[i];
    }

    // 키의 합이 100이되는 지점 찾기
    boolean check = false;
    for(int i = 0; i < array.length; i++) {
      // 키의 합이 100이되는 지점을 찾았을 경우
      if(check) {
        break;
      }
      for(int j = i + 1; j < array.length; j++) {
        if(sum - array[i] - array[j] == 100) {
          check = true;
          array[i] = 0;
          array[j] = 0;
        }
      }
    }

    // 정렬 알고리즘을 통해 정렬 수행
    Arrays.sort(array);

    // 결과 값 출력
    for(int i = 0; i < array.length; i++) {
      if(array[i] != 0){
        System.out.println(array[i]);
      }
    }
  } 
}