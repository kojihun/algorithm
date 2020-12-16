import java.io.*;
import java.util.*;

/**
 * @author Kojihun (CodeUp) 정수 1개 입력받기
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int y, m, d;
        String c = sc.next();
        String[] arr = c.split("\\.");
        
        y = Integer.parseInt(arr[0]);
        m = Integer.parseInt(arr[1]);
        d = Integer.parseInt(arr[2]);
        
        System.out.print(String.format("%04d", y) + "." + String.format("%02d", m) + "." + String.format("%02d", d));
    }
}

