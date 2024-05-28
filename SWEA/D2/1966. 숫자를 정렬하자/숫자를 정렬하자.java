import java.util.Scanner;
import java.io.FileInputStream;
import java.util.*;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
        
		for(int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            
            int[] numbers = new int[N];
            for(int i = 0; i < N; i++) {
            	numbers[i] = sc.nextInt();
            }
            
            Arrays.sort(numbers);
            
            StringBuilder sb = new StringBuilder();
            sb.append("#").append(test_case).append(" ");
            for(int i = 0; i < numbers.length; i++) {
            	sb.append(numbers[i]).append(" ");
            }
            
            System.out.println(sb.toString());
		}
	}
}