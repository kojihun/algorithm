import java.util.Scanner;

/**
 * @author Kojihun
 * (백준 10872) 팩토리얼
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = 1;
        
        for(int i = 1; i <= number; i++){
            result = result * i;
        }
        System.out.println(result);
    }
}
