import java.util.Scanner;

/**
 * @author Kojihun
 * (백준 2884) 알람 시계
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int H = sc.nextInt();
        int M = sc.nextInt();
        
        if(H >= 0 && H <= 23){
            if(M >= 0 && M <= 59){
                if(M < 45){
                    M = (M + 60) - 45;
                    if ( H == 0){
                        H = 23;
                    }
                    else{
                        H = H - 1;
                    }
                }
                else{
                    M = M - 45;
                }
                System.out.print(H + " " + M);
            }
        }
    }    
}