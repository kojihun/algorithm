import java.io.*;
import java.util.*;

/**
 * @author Kojihun (CodeUp)
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        
        System.out.print(String.format("%c", c + 1));
    }
}

