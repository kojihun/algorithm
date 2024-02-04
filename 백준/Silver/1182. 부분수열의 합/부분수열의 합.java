import java.util.*;

public class Main
{
    public static int N;
    public static int S;
    public static int[] input;
    public static int answer = 0;
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    N = scanner.nextInt();
	    S = scanner.nextInt();
	    
	    input = new int[N];
	    for(int i = 0; i < N; i++) {
	        input[i] = scanner.nextInt();
	    }
	    
	    DFS(0, 0);
	    
	    if(S == 0) {
	        answer--;
	    }
	    
	    System.out.println(answer);
	}
	
	public static void DFS(int depth, int sum) {
	    if(depth == N) {
	        if(sum == S) {
	            answer++;
	            return;
	        }
	        return;
	    }
	    
	    DFS(depth + 1, sum);
	    DFS(depth + 1, sum + input[depth]);
	}
}