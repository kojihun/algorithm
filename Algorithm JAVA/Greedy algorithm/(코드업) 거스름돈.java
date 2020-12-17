import java.io.*;
import java.util.*;

/**
 * @author Kojihun (CodeUp) 거스름돈
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        int[] array = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
        int count = 0;

        for(int coin : array){
            count += money / coin;
            money %= coin;
        }
        
        System.out.println(count);
    }
}




