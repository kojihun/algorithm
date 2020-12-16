import java.io.*;
import java.util.*;

/**
 * @author Kojihun (CodeUp)
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 0;
        int result = 0;
        while(true){
            if(result >= num){
                System.out.println(result);
                break;
            }
            i++;
            result = result + i;
        }
    }
}

