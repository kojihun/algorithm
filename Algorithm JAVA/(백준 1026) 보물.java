import java.io.*;
import java.util.*;

/**
 * @author Kojihun 
 * (백준 1026) 보물
 */
public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int S = 0;
        
        int[] A = new int[num];
        int[] B = new int[num];
        
        for(int i = 0; i < A.length; i++){
            A[i] = sc.nextInt();
        }
        
        for(int i = 0; i < B.length; i++){
            B[i] = sc.nextInt();
        }
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int i = 0; i < num; i++){
            S = S + (A[i] * B[num - 1 - i]);
        }
        
        System.out.println(S);
    }
}
