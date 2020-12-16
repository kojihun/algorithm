
import java.io.*;
import java.util.*;

/**
 * @author Kojihun (CodeUp)
 */
public class Main {
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] numlist = new int[count];
        int[] list = new int[24];
        int num = 0;
        
        for (int i = 0; i < count; i++) {
            numlist[i] = sc.nextInt();
            num = numlist[i];
            list[num]++;
        }
        
        for (int i = 1; i <= 23; i++) {
            System.out.print(list[i] + " ");
        }
    }
}

