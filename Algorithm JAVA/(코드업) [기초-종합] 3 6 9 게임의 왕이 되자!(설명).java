import java.io.*;
import java.util.*;

/**
 * @author Kojihun (CodeUp)
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        
        for(int i = 1; i <= count; i++){
            if(i % 3 == 0){
                System.out.print("X ");
            }else{
                System.out.print(i+" ");
            }
        }
    }
}

