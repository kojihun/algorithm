import java.io.*;
import java.util.*;

/**
 * @author Kojihun (CodeUp)
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int num = Integer.parseInt(s, 16);
        for (int i = 1; i < 16; i++) {
            System.out.format("%X*%X=%X\n", num, i, num * i);
        }
    }
}

