import java.io.*;
import java.util.*;

/**
 * @author Kojihun (CodeUp)
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int number = Integer.valueOf(s,8);
        
        System.out.print(String.format("%d", number));
    }
}

