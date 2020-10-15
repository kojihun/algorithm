import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;


/**
 * @author Kojihun
 * (백준 10828) 스택
 */

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        String action;
        String[] array;
        int[] stack = new int[num];
        int top = -1;
        
        for(int i = 0; i < num; i++){
            action = br.readLine();
            array = action.split(" ");
            
            if(array[0].equals("push")){
                top++;
                stack[top] = Integer.parseInt(array[1]);
            }
            else if(array[0].equals("pop")){
                if(top == -1){
                    System.out.println(-1);
                }
                else{
                    System.out.println(stack[top]);
                    top--;
                }
            }
            else if(array[0].equals("size")){
                System.out.println(top+1);
            }
            else if(array[0].equals("empty")){
                if(top == -1){
                    System.out.println(1);
                }
                else{
                    System.out.println(0);
                }
            }
            else if(array[0].equals("top")){
                if(top == -1){
                    System.out.println(-1);
                }
                else{
                    System.out.println(stack[top]);
                }
            }
        }
    }
}