import java.io.*;
import java.util.*;

/**
 * @author Kojihun (CodeUp)
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[][] matrix = new int[19][19];

        for (int i = 0; i < count; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            matrix[x - 1][y - 1] = 1;
        }

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}

