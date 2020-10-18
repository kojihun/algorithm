import java.io.*;
import java.util.*;

/**
 * @author Kojihun (백준 1260) DFS 와 BFS
 */
public class Main {

    static int[][] check;
    static boolean[] checked;
    static int n; //정점의 개수
    static int m; //간선의 개수
    static int start; //시작 정점
    
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        start = sc.nextInt();
        
        check = new int[1001][1001];
        checked = new boolean[1001];
        
        //간선 상태 저장
        for(int i = 0; i < m; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            check[x][y] = check[y][x] = 1;
        }
        
        dfs(start);
        
        checked = new boolean[1001];
        System.out.println();
        
        bfs();
    }
    
    public static void dfs(int start){
        checked[start] = true; //시작지점은 방문했으므로 true설정
        System.out.print(start + " ");
        
        for(int i = 1; i <= n; i++){
            if(check[start][i] == 1 && checked[i] == false){
                dfs(i);
            }
        }
    }
    
    public static void bfs(){
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(start); //시작점 큐에 삽입
        checked[start] = true;
        System.out.print(start + " ");
        
        while(!queue.isEmpty()){
            int temp = queue.poll();
            
            for(int i = 1; i <= n; i++){
                if(check[temp][i] == 1 && checked[i] == false){
                    queue.offer(i);
                    checked[i] = true;
                    System.out.print(i + " ");
                }
            }
        }
    }
}
