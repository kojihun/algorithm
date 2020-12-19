import java.io.*;
import java.util.*;

/**
 * @author Kojihun (이것이 코딩 테스트다) 모험가 길드
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] people = new int[num];
        
        for (int i = 0; i < people.length; i++) {
            people[i] = sc.nextInt();
        }
        Arrays.sort(people);

        int result = 0;
        int count = 0;
   
        for(int i : people){
            count += 1;
            if(count >= i){
                result += 1;
                count = 0;
            }
        }
        
        System.out.println(result);
    }
}

