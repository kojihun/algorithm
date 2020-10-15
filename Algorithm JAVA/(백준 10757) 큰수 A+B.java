import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Kojihun
 * (백준 10757) 큰수 A+B
 */

public class Main {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         
         String sentence = sc.nextLine();
         String[] arr = sentence.split(" ");
         
         BigInteger A = new BigInteger(arr[0]);
         BigInteger B = new BigInteger(arr[1]);
         
         System.out.println(A.add(B));
    }
}