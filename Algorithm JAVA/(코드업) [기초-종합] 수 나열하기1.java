
import java.io.*;
import java.util.*;

/**
 * @author Kojihun (CodeUp)
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int plus = sc.nextInt();
        int pos = sc.nextInt();
        int count = 0;

        for (int i = start; i <= 10000000; i = i + plus) {
            count++;
            if(count == pos){
                System.out.println(i);
                break;
            }
        }
    }
}


