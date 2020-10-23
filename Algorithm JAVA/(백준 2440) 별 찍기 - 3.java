import java.util.Scanner;

/**
 * @author Kojihun
 * (백준 2440) 별 찍기 - 3
 */

public class Main {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();
         
         for(int i = 0; i < num; i++){
             for(int j = i + 1; j <= num; j++){
                System.out.print("*");
             }
             System.out.println();
         }
    }
}
