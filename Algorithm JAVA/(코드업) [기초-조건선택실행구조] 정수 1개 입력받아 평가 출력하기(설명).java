import java.io.*;
import java.util.*;

/**
 * @author Kojihun (CodeUp)
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a >= 90 && a <= 100) {
            System.out.println("A");
        } else if (a >= 70 && a <= 89) {
            System.out.println("B");
        } else if (a >= 40 && a <= 69) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}
