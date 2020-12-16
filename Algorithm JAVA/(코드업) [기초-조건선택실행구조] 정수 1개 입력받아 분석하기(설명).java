import java.io.*;
import java.util.*;

/**
 * @author Kojihun (CodeUp)
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a < 0) {
            System.out.println("minus");
            if (a % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        } else {
            System.out.println("plus");
            if (a % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }
}

