import java.io.*;
import java.util.*;

/**
 * @author Kojihun 
 * (백준 2576) 홀수
 */
public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int[] num = new int[7];
        int[] odd = new int[7];
        int oddindex = 0;
        int oddmin = 0;
        int sum = 0;
        
        for(int i = 0; i < 7; i++){
            num[i] = sc.nextInt();
            if(num[i] % 2 != 0){
                sum += num[i];
                odd[oddindex] = num[i];
                oddindex++;
            }
        }

        Arrays.sort(odd);

        for(int i = 0; i < 7; i++){
            if(odd[i] != 0){
                oddmin = odd[i];
                break;
            }
        }
                
        if(sum == 0){
            System.out.println(-1);
        }else{
            System.out.println(sum);
            System.out.println(oddmin);
        }
    }
}