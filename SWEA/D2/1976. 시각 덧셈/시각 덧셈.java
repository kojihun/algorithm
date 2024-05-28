import java.util.Scanner;
import java.io.FileInputStream;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
        
		for(int test_case = 1; test_case <= T; test_case++) {
            int hour1 = sc.nextInt();
            int minute1 = sc.nextInt();
            int hour2 = sc.nextInt();
            int minute2 = sc.nextInt();
            
            int addHour = hour1 + hour2;
            int addMinute = minute1 + minute2;
            
            if(addMinute / 60 >= 1) {
                addHour += addMinute / 60;
            	addMinute = addMinute % 60;
            }
            
            if(addHour > 12) {
                if(addHour % 12 == 0) {
                	addHour = 12;
                }else {
	            	addHour = addHour % 12;            
                }
            }
            
            System.out.println("#" + test_case + " " + addHour + " " + addMinute);
		}
	}
}