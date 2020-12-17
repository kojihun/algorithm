import java.io.*;
import java.util.*;

/**
 * @author Kojihun (CodeUp) 리모컨
 */
public class Main {

    private static int remote(int startnum, int goalnum) {
        int need = goalnum - startnum;
        int count = 0;

        if (need < 0) {
            need *= -1;
        }

        while (true) {
            if (need >= 10 || need >= 8) {
                need -= 10;
                count++;
            } else if (need >= 5 || need >= 4) {
                need -= 5;
                count++;
            } else if (need > 0) {
                need -= 1;
                count++;
            } else if (need == 0) {
                break;
            } else {
                need += 1;
                count++;
            }
        }
        
        return count;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println(remote(sc.nextInt(), sc.nextInt()));
    }
}

