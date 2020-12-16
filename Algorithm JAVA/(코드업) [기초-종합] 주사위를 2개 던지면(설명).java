
import java.io.*;
import java.util.*;

/**
 * @author Kojihun (CodeUp)
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int dice1 = sc.nextInt();
        int dice2 = sc.nextInt();

        for (int i = 1; i <= dice1; i++) {
            for (int j = 1; j <= dice2; j++) {
                System.out.println(i + " " + j);
            }
        }
    }
}

