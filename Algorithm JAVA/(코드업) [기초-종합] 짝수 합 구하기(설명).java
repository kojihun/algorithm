import java.io.*;
import java.util.*;

/**
 * @author Kojihun (CodeUp)
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 0;

        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                result = result + i;
            }
        }
        System.out.println(result);
    }
}

