
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
        int i = 0;

        while (true) {
            i++;
            result = result + i;
            if (num <= result) {
                System.out.println(i);
                break;
            }
        }
    }
}

