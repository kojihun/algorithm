import java.io.*;
import java.util.*;

/**
 * @author Kojihun (CodeUp)
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if(a % 2 == 0){
            System.out.println(a);
        }
        
        if(b % 2 == 0){
            System.out.println(b);
        }
        
        if(c % 2 == 0){
            System.out.println(c);
        }
    }
}

