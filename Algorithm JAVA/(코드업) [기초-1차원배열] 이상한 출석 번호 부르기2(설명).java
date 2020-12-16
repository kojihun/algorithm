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

        for (int i = 0; i < count; i++) {
            list[i] = sc.nextInt();
        }

        for (int i = count - 1; i >= 0; i--) {
            System.out.print(list[i] + " ");
        }
    }
}

