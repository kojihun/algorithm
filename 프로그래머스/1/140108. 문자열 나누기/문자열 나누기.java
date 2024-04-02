class Solution {
    public int solution(String s) {
        int answer = 0;
        int start = 0;
        
        while (start < s.length()) {
            char x = s.charAt(start);
            int countX = 0;
            int countOther = 0;
            int end = start;
            while (end < s.length()) {
                if (s.charAt(end) == x) {
                    countX++;
                } else {
                    countOther++;
                }
                
                if (countX == countOther) {
                    answer++;
                    start = end + 1;
                    break;
                }
                
                end++;
            }
            
            if (end == s.length()) {
                answer++;
                break;
            }
        }
        
        return answer;
    }
}
