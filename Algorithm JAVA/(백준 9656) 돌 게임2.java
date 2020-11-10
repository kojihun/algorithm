import java.io.*;
import java.util.*;

/**
 * @author Kojihun 
 * (백준 9656) 돌 게임2
 */
public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        if(num % 2 ==0){
            System.out.println("SK");
        }else{
            System.out.println("CY");
        }
    }
}
