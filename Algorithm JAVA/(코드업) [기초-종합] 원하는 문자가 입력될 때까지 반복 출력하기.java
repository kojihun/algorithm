
import java.io.*;
import java.util.*;

/**
 * @author Kojihun (CodeUp)
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (true) {
            char ch = sc.next().charAt(0);
            System.out.println(ch);
            if (ch == 'q') {
                break;
            }
        }
    }
}
