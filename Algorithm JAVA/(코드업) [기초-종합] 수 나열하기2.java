
import java.io.*;
import java.util.*;

/**
 * @author Kojihun (CodeUp)
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int plus = sc.nextInt();
        int pos = sc.nextInt();

        System.out.println(start*(long)(Math.pow(plus, pos-1)));
    }
}

