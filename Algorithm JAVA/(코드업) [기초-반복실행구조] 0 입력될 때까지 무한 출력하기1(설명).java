import java.io.*;
import java.util.*;

/**
 * @author Kojihun (CodeUp)
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        while(true){
            int num = sc.nextInt();
            if(num == 0){
                break;
            }
            System.out.println(num);
        }
    }
}

