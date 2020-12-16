import java.io.*;
import java.util.*;

/**
 * @author Kojihun (CodeUp) 정수 1개 입력받기
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] list = s.split("");
        
        System.out.println("["+Integer.parseInt(list[0])*10000+"]");
        System.out.println("["+Integer.parseInt(list[1])*1000+"]");
        System.out.println("["+Integer.parseInt(list[2])*100+"]");
        System.out.println("["+Integer.parseInt(list[3])*10+"]");
        System.out.print("["+Integer.parseInt(list[4])*1+"]");
        
    }
}
