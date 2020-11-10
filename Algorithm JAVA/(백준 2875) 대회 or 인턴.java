import java.io.*;
import java.util.*;

/**
 * @author Kojihun 
 * (백준 2875) 대회 or 인턴
 */
public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        
        int team = 0;
                
        while(N >= 2 && M >=1 && N+M >= 3+K){
            team++;
            N = N - 2;
            M = M - 1;
        }
        
        System.out.println(team);
    }
}
