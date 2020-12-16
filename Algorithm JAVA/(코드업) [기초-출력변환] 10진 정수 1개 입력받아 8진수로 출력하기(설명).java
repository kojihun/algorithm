import java.io.*;
import java.util.*;

/**
 * @author Kojihun (CodeUp) 시분초 입력받기
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
        System.out.print(String.format("%o", number));
    }
}

