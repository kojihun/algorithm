import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Kojihun
 * (백준 2751) 수 정렬하기
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        int count = sc.nextInt();
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < count; i++){
            list.add(sc.nextInt());
        }
        
        Collections.sort(list);
        
        for(int value : list){
            sb.append(value).append('\n');
        }
        System.out.println(sb);
    }
}
