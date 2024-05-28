import java.util.Scanner;
import java.io.FileInputStream;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
        
        int[] coins = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		for(int test_case = 1; test_case <= T; test_case++) {
            int[] count = new int[coins.length];
            
            int N = sc.nextInt();
            for(int i = 0; i < coins.length; i++) {
            	int coin = coins[i];
                if(N / coin > 0) {
                    count[i] = N / coin;
                	N = N % coin;
                }
            }
            
            StringBuilder sb = new StringBuilder();
            sb.append("#").append(test_case).append("\n");
            for(int i = 0; i < count.length; i++) {
            	sb.append(count[i]).append(" ");
            }
            System.out.println(sb.toString());
		}
	}
}