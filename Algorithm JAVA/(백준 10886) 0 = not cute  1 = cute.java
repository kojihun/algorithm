import java.io.*;
import java.util.*;

/**
 * @author Kojihun 
 * (백준 10886) 0 = not cute / 1 = cute
 */
public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int vote;
        int cute = 0;
        int notcute = 0;
        
        for(int i = 0; i < num; i++){
            vote = sc.nextInt();
            if(vote == 1){
                cute++;
            }else{
                notcute++;
            }
        }
        
        if(cute > notcute){
            System.out.println("Junhee is cute!");
        }else{
            System.out.println("Junhee is not cute!");
        }
    }
}