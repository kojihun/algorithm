
import java.io.*;
import java.util.*;

/**
 * @author Kojihun (CodeUp)
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] matrix = new int[h][w];
        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            int l = sc.nextInt();
            int d = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            for(int j = 0; j < l; j++){
                if(d == 0){
                    matrix[x-1][y-1] = 1;
                    y++;
                }else if(d == 1){
                    matrix[x-1][y-1] = 1;
                    x++;
                }
            }
        }

        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}

