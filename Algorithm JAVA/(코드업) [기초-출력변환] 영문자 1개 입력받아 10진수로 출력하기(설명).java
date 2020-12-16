import java.io.*;
import java.util.*;

/**
 * @author Kojihun (CodeUp)
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        char s = sc.next().charAt(0);
        int number = Integer.valueOf(s);
        
        System.out.print(String.format("%d", number));
    }
}

