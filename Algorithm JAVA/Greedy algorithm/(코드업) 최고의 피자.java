
import java.io.*;
import java.util.*;

/**
 * @author Kojihun (CodeUp) 최고의 피자
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //토핑 종류 개수
        int dow = sc.nextInt(); //도우 가격
        int topping = sc.nextInt(); //토핑 가격
        int dowCal = sc.nextInt(); //도우 칼로리
        int[] toppingCal = new int[N];
        int index = toppingCal.length - 1;
        for (int i = 0; i < toppingCal.length; i++) { //토핑 칼로리
            toppingCal[i] = sc.nextInt();
        }

        Arrays.sort(toppingCal);

        int beforePerCal = dowCal / dow;
        int afterPerCal = dowCal;
        int totalCal = dowCal;
        int price = dow;

        while (true) {
            price += topping;
            totalCal += toppingCal[index--];
            afterPerCal = totalCal / price;
            if (beforePerCal > afterPerCal) {
                break;
            } else {
                beforePerCal = afterPerCal;            }

        }
        System.out.println(beforePerCal);
    }
}

