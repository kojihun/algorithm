import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;


/**
 * @author Kojihun
 * (백준 10845) 큐
 */

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        String action; //명령을 처리하기 위한 변수
        String[] array;
        int[] queue = new int[num]; //큐 배열
        int front = 0; //큐의 맨 앞
        int back = -1; //큐의 맨 뒤
        
        for(int i = 0; i < num; i++){
            action = br.readLine();
            array = action.split(" ");
            
            if(array[0].equals("push")){
                back++;
                queue[back] = Integer.parseInt(array[1]);
            }
            else if(array[0].equals("pop")){
                if(front > back){
                    System.out.println(-1);
                }
                else{
                    System.out.println(queue[front]);
                    front++;
                }
            }
            else if(array[0].equals("front")){
                if(front > back){
                    System.out.println(-1);                
                }else{
                    System.out.println(queue[front]);
                }
            }
            else if(array[0].equals("back")){
                if(front > back){
                    System.out.println(-1);
                }
                else{
                    System.out.println(queue[back]);
                }
            }
            else if(array[0].equals("size")){
                System.out.println(back - (front - 1));
            }
            else if(array[0].equals("empty")){
                if(front > back){
                    System.out.println(1);
                }
                else{
                    System.out.println(0);
                }
            }
        }
    }
}