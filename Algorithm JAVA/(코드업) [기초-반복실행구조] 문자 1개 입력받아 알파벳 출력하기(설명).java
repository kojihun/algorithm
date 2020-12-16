import java.io.*;
import java.util.*;

/**
 * @author Kojihun (CodeUp)
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        char alphabet = sc.next().charAt(0);
        
        for(int i = 97; i <= (int)alphabet; i++){
            System.out.print(String.format("%c", i) + " ");
        }
    }
}

