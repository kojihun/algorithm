import java.io.*;
import java.util.*;

/**
 * @author Kojihun 
 * (백준 15988) 1, 2, 3 더하기 3
 */
public class Main {
    public static void main(String[] args) throws IOException{
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       int n;
       
       long[] output = new long[10000000];
       output[0] = 0;
       output[1] = 1; //{1}
       output[2] = 2; //{1+1, 2}
       output[3] = 4; //{1+1+1, 2+1,1+2, 3} 
       
       for(int i = 0; i < num; i++){
           n = sc.nextInt();
           for(int j = 4; j <= n; j++){
               output[j] = (output[j-1]+output[j-2]+output[j-3])% 1000000009;
           }
           System.out.println(output[n]);
       }
    }
}
