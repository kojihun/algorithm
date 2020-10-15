import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;


/**
 * @author Kojihun
 * (백준 10989) 수 정렬하기 3
 */

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        int[] array = new int[N];
        
        for(int i = 0; i < N; i++){
            array[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(array);
        
        for(int i = 0; i < N; i++){
            sb.append(array[i]).append("\n");
        }
        System.out.println(sb);
    }
}