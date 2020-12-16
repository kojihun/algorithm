
import java.io.*;
import java.util.*;

/**
 * @author Kojihun (CodeUp)
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] list = new int[count];
        int min = 10000;

        for (int i = 0; i < count; i++) {
            list[i] = sc.nextInt();
            if (list[i] < min) {
                min = list[i];
            }
        }
        System.out.print(min);
    }
}

