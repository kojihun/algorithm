
import java.io.*;
import java.util.*;

/**
 * @author Kojihun (CodeUp)
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int day = 1;

        while (true) {
            if(day % a == 0 && day % b == 0 && day % c == 0) {
                break;

            }else{
                day++;
            }
        }

        System.out.println(day);
    }
}
