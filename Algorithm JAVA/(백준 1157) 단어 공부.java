import java.io.*;
import java.util.*;

/**
 * @author Kojihun 
 * (백준 1157) 단어 공부
 */
public class Main {
    public static void main(String[] args) throws IOException{
       Scanner sc = new Scanner(System.in);
       
       int[] arr = new int[26]; //알파벳의 개수만큼 배열 할당 
       
       String S = sc.next(); //단어를 입력받을 변수
       S = S.toUpperCase(); //알파벳을 모두 대문자로 변환
       
       for(int i = 0; i < S.length(); i++){
           arr[S.charAt(i) - 65]++; //대문자의 범위가 A부터 시작하기 때문
       }
       
       int max = -1;
       char ch = '?';
       
       for(int i = 0; i < 26; i++){
           if(arr[i] > max){
               max = arr[i];
               ch = (char) (i + 65);
           }
           else if(arr[i] == max){
               ch = '?';
           }
       }
       System.out.print(ch);
    }
}