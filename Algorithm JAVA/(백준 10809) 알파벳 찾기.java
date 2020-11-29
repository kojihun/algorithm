import java.io.*;
import java.util.*;

/**
 * @author Kojihun 
 * (백준 10809) 알파벳 찾기
 */
public class Main {
    public static void main(String[] args) throws IOException{
       Scanner sc = new Scanner(System.in);
       
       int[] arr = new int[26]; //알파벳의 개수만큼 배열을 할당
       
       for(int i = 0; i < arr.length; i++){ //배열내 값을 -1로 초기화
           arr[i] = -1;
       }
       
       String S = sc.nextLine(); //단어를 입력받을 변수
       
       for(int i = 0; i < S.length(); i++){
           char ch = S.charAt(i);
           
           if(arr[ch - 'a'] == -1){
               arr[ch - 'a'] = i;
           }
       }
       
       for(int val : arr){
           System.out.print(val+" ");
       }
    }
}
