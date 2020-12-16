import java.io.*;
import java.util.*;

/**
 * @author Kojihun (CodeUp) 정수 1개 입력받기
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int f, r;
        String c = sc.next();
        String[] arr = c.split("-");
        
        
        f = Integer.parseInt(arr[0]);
        r = Integer.parseInt(arr[1]);
        
        System.out.print(String.format("%06d", f)+""+r);
    }
}

