import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Kojihun
 * (백준 10953) A+B - 9
 */

public class Main {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         BigInteger A = sc.nextBigInteger();
         BigInteger B = sc.nextBigInteger();
         
         System.out.println(A.add(B));
    }
}