import java.io.*;
import java.util.*;

/**
 * @author Kojihun (CodeUp)
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[10][10];
        int x = 2;
        int y = 2;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matrix[x - 1][y - 1] == 0) {
                    matrix[x - 1][y - 1] = 9;
                    if (matrix[x - 1][y] != 1) {
                        y++;
                    } else {
                        x++;
                    }
                } else if (matrix[x - 1][y - 1] == 2) {
                    matrix[x - 1][y - 1] = 9;
                    break;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

