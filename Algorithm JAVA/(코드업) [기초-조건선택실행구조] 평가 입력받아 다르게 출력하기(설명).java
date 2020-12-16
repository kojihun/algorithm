import java.io.*;
import java.util.*;

/**
 * @author Kojihun (CodeUp)
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);

        switch(a){
            case 'A':
                System.out.print("best!!!");
                break;
            case 'B':
                System.out.print("good!!");
                break;
            case 'C':
                System.out.print("run!");
                break;
            case 'D':
                System.out.print("slowly~");
                break;
            default:
                System.out.print("what?");
                break;
        }
    }
}
