class Solution {
    public int[] solution(int brown, int yellow) {
        int totalTile = brown + yellow;
        
        // yellow가 존재하기 위해서는 가로와 세로의 길이가 3이상이여야 한다.
        for(int i = 3; i < totalTile; i++) {
            int col = i; // 세로
            int row = totalTile / col; // 가로
            
            // 가로의 갯수가 3이하라면 다음 인덱스
            if(row < 3) {
                continue;
            }
            
            // 가로는 세로의 길이보다 크거나 같다
            if(row >= col) {
                if((row - 2) * (col - 2) == yellow) {
                    return new int[] {row, col};
                }
            }
        }
        
        return null;
    }
}