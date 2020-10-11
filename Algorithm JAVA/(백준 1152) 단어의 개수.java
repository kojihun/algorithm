import java.util.Scanner;

/**
 * @author Kojihun
 * (백준 1152) 단어의 개수
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        
        boolean flag = true;
        int count = 0;
        
        for(int i = 0; i < sentence.length(); i++){
            if(sentence.charAt(i)==' '){
                flag = true;
            }else{
                if(flag == true){
                    count++;
                    flag = false;
                }
            }
        }
        System.out.println(count);
    }
}
