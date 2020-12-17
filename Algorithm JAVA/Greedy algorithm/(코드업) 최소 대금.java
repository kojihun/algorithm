import java.io.*;
import java.util.*;

/**
 * @author Kojihun (CodeUp) 최소대금
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] pastalist = new int[3];
        int[] juicelist = new int[2];
        int minPasta = 1000000;
        int minJuice = 1000000;

        for (int i = 0; i < 3; i++) {
            pastalist[i] = sc.nextInt();
            if (pastalist[i] < minPasta) {
                minPasta = pastalist[i];
            }
        }

        for (int i = 0; i < 2; i++) {
            juicelist[i] = sc.nextInt();
            if(juicelist[i]  < minJuice){
                minJuice = juicelist[i];
            }
        }
        
        System.out.format("%.1f", (minPasta+minJuice)+((minPasta+minJuice)*0.1));
    }
}

