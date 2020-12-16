import java.io.*;
import java.util.*;

/**
 * @author Kojihun (CodeUp) 시분초 입력받기
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] list = s.split("\\.");
        
        int y = Integer.parseInt(list[0]);
        int m = Integer.parseInt(list[1]);
        int d = Integer.parseInt(list[2]);
        
        System.out.print(String.format("%02d", d) + "-" + String.format("%02d", m) + "-" + y);
        
    }
}

