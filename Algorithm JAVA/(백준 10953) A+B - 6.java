import java.util.Scanner;

/**
 * @author Kojihun
 * (백준 10953) A+B - 6
 */

public class Main {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();
         sc.nextLine();
         
         String[] array; 
         String AB;
         for(int i = 0; i < num; i++){
              AB = sc.nextLine();
              array = AB.split(",");
              
              System.out.println(Integer.parseInt(array[0]) + Integer.parseInt(array[1]));
         }
    }
}