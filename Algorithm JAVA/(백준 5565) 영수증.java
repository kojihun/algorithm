import java.io.*;
import java.util.*;

/**
 * @author Kojihun 
 * (백준 5565) 영수증
 */
public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int totalprice = sc.nextInt();
        int sum = 0;
        int num;
        
        for(int i = 0; i < 9; i ++){
            num = sc.nextInt();
            sum = sum + num;
        }
        
        System.out.println(totalprice - sum);
    }
}
