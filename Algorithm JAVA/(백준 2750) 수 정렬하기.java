import java.util.Scanner;

/**
 * @author Kojihun
 * (백준 2750) 수 정렬하기
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        
        int[] array = new int[1000];
        
        for(int i = 0; i< count; i++){
            array[i] = sc.nextInt();
        }
        
        for(int i = 0; i < count; i++){
            for(int j = 0; j < count; j++){
                if(array[i] < array[j]){
                    int space = array[i];
                    array[i] = array[j];
                    array[j] = space;
                }
            }
        }
        
        for(int i = 0; i< count; i++){
            System.out.println(array[i]);
        }
    }
}
