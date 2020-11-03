import java.io.*;
import java.util.*;

/**
 * @author Kojihun 
 * (백준 1181) 단어정렬
 */
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<String>();
        
        for(int i = 0; i < num; i++){
            String temp = br.readLine();
            
            if(!list.contains(temp)){
                list.add(temp);
            }
        }
        
        Comparator<String> comparator = new Comparator<String>(){
            public int compare(String x, String y){
                if(x.length() > y.length()){
                    return 1;
                }
                else if(x.length() == y.length()){
                    return x.compareTo(y);
                }
                return -1;
            }
        };
        
        Collections.sort(list, comparator);
        
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
