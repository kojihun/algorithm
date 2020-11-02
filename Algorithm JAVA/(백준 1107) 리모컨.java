import java.io.*;
import java.util.*;

/**
 * @author Kojihun 
 * (백준 1107) 리모컨
 */
public class Main {
    static boolean[] broke = new boolean[10];
    
    static int possible(int c){
        
        if( c == 0){
            if(broke[0]){
                return 0;
            }else{
                return 1;
            }
        }
        int len = 0;
        while(c > 0){
            if(broke[c % 10]){ //고장난 버튼일 경우 조건문 내부 실행
                return 0;
            }
            len += 1;
            c = c/10;
        }
        return len;
    }    
    
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        
        int channel = sc.nextInt(); //채널
        int num = sc.nextInt(); //고장 채널 개수
        for(int i = 0; i < num; i++){
            int x = sc.nextInt();
            broke[x] = true; //고장난 채널에 true로 저장
        }
        
        int ans = Math.abs(channel - 100); //초기 설정 채널은 100이므로 이동할 채널에서 빼준다.
        
        //0부터 1000000까지 모든 채널을 돌며 가장 적게 눌러서 이동하는 채널을 찾아야한다.
        for(int i = 0; i < 1000000; i++){
            int c = i;
            int len = possible(c);
            
            if(len > 0){
                int press = Math.abs(c - channel);
                if(ans > len + press){
                    ans = len + press;
                }
            }
        }
        System.out.println(ans);
    }
}
