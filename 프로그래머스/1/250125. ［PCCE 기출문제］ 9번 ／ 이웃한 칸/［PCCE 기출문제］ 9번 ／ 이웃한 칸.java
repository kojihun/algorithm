class Solution {
    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};
    public int solution(String[][] board, int h, int w) {
        String color = board[h][w];
        int n = board.length;
        int m = board[0].length;
        
        int answer = 0;
        for(int i = 0; i < 4; i++) {
            int nh = h + dy[i];
            int nw = w + dx[i];
            if(nh >= 0 && nh < n && nw >= 0 && nw < m) {
                if(board[nh][nw].equals(color)) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}