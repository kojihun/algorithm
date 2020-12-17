import java.io.*;
import java.util.*;

/**
 * @author Kojihun (CodeUp) 1이될때까지
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int result = 0;

        while (true) {
            int target = (n / k) * k;
            result += (n - target);
            n = target;

            if (n < k) {
                break;
            }

            result += 1;
            n /= k;
        }
        System.out.println(result);
        
        result += (n - 1);
        System.out.println(result);
    }
}

