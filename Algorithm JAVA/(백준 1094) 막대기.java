import java.io.*;
import java.util.*;

/**
 * @author Kojihun 
 * (백준 1094) 막대기
 */
public class Main {
    public static void main(String[] args) throws IOException{
       Scanner sc = new Scanner(System.in);
       int stick = 64;
       int x = sc.nextInt();
       int count = 0;
       int sum = 0;
       
       while(x > 0){
           if(stick > x){
               stick /= 2;
           }else{
               count++;
               x -= stick;
           }
        }
       System.out.println(count);
    }
}
