import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * @author Kojihun
 * (백준 9012) 괄호
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        
        while(num > 0){
            boolean isVPS = true;
            String input = br.readLine();
            Stack<Character> stack = new Stack<>();
            
            char temp;
            
            for(int i = 0; i < input.length(); i++){
                temp = input.charAt(i);
                
                if(temp == '('){
                    stack.push(temp);
                }else if(temp == ')'){
                    if(!stack.isEmpty()){
                        stack.pop();
                    }else{
                        isVPS = false;
                        break;
                    }
                }
            }
            
            if(!stack.isEmpty()){
                isVPS = false;
            }
            
            if(isVPS){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            num--;
        }
    }
}