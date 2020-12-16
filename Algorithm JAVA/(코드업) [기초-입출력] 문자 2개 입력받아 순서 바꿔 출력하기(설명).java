import java.io.*;
import java.util.*;

/**
 * @author Kojihun (CodeUp) 정수 1개 입력받기
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        char x, y;
        x = sc.next().charAt(0);
        y = sc.next().charAt(0);
        
        System.out.print(y + " " + x);
    }
}

