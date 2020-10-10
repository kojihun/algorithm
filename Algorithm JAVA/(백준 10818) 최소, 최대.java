import java.util.Scanner;

/**
 * @author Kojihun
 * (백준 10818) 최소, 최대
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int max = -1000000001;
        int min = 100000000;
        
        int num = sc.nextInt();
        int[] array = new int[num];
        
        for(int i = 0; i < num; i++){
            array[i] = sc.nextInt();
        }
        
        for(int i = 0; i < num; i++){
            if(max < array[i]){
                max = array[i];
            }
            if(min > array[i]){
                min = array[i];
            }
        } 
        System.out.print(min + " " + max);
    }    
}