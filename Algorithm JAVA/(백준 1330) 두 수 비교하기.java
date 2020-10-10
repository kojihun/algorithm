import java.util.Scanner;

/**
 * @author Kojihun
 * (백준 1330) 두 수 비교하기
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double A = sc.nextFloat();
        double B = sc.nextFloat();
        
        if(A < B){
            System.out.print("<");
        }else if(A > B){
            System.out.print(">");
        }else{
            System.out.print("==");
        }
    }    
}
