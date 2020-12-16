
import java.io.*;
import java.util.*;

/**
 * @author Kojihun (CodeUp)
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;

        BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < g; j++) {
                String str = "";
                for (int k = 0; k < b; k++) {
                    str += i + " " + j + " " + k + "\n";
                    count++;
                }
                bf.write(str);
                bf.flush();
            }
        }
        System.out.print(count);
    }
}

