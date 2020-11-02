import java.io.*;
import java.util.*;

/**
 * @author Kojihun 
 * (백준 1037) 약수
 */
public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        boolean flag = false;
        int[] arr = new int[N];
        int k;
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        
        System.out.println(arr[0] * arr[N - 1]);
    }
}
