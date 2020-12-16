import java.io.*;
import java.util.*;

/**
 * @author Kojihun (CodeUp)
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        switch (a) {
            case 1:
            case 2:
            case 12:
                System.out.print("winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.print("spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.print("summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.print("fall");
                break;
            default:
                break;
        }
    }
}

