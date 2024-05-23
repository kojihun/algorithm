import java.util.Scanner;
import java.io.FileInputStream;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
            int maxNumber = Integer.MIN_VALUE;
            int minNumber = Integer.MAX_VALUE;
            
            int[] input = new int[10];
            for(int i = 0; i < 10; i++) {
            	int number = sc.nextInt();
                input[i] = number;
                
                if(maxNumber < number) {
                	maxNumber = number;
                }
                
                if(minNumber > number) {
                	minNumber = number;
                }
            }
            
            float sumNumber = 0;
            for(int i = 0; i < 10; i++) {
            	int number = input[i];
                if(number != maxNumber && number != minNumber) {
                	sumNumber += number;
                }
            }
            
            System.out.println("#" + test_case + " " + Math.round(sumNumber / 8));
		}
	}
}