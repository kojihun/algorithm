import java.io.*;
import java.util.*;

/**
 * @author Kojihun (이것이 코딩 테스트다) 곱하기 혹은 더하기
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.next().split("");
        int result = 0;

        if (Integer.parseInt(arr[0]) != 0) {
            result = Integer.parseInt(arr[0]);
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (Integer.parseInt(arr[i]) == 0 || Integer.parseInt(arr[i]) == 1) {
                result += Integer.parseInt(arr[i]) + Integer.parseInt(arr[i + 1]);
            } else {
                result = result * Integer.parseInt(arr[i + 1]);
            }
        }
        System.out.print(result);
    }
}
