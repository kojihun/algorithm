import java.io.*;
import java.util.*;

/**
 * @author Kojihun (CodeUp) 정수 1개 입력받기
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] list = new char[s.length()];
        
        for(int i = 0; i < list.length; i++){
            list[i] = s.charAt(i);
        }
        
        for(char c:list){
            System.out.println("'"+c+"'");
        }
    }
}

