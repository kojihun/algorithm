class Solution {
    public String[] solution(String my_str, int n) {
        int startIndex = 0;
        int endIndex = n;
        
        // 1. 총 반복 횟수를 구하고 반복문을 순회한다.
        int round = my_str.length() % n == 0 ? my_str.length() / n : my_str.length() / n + 1;
        String[] answer = new String[round];
        for(int i = 0; i < answer.length; i++) {
            // 2.문자열을 startIndex부터 endIndex까지 자른다.
            if(endIndex <= my_str.length()) {
                answer[i] = my_str.substring(startIndex, endIndex);
            }else {
                answer[i] = my_str.substring(startIndex);
            }
            
            // 3. 인덱스 위치 조정
            startIndex += n;
            endIndex += n;
        }
        
        // 4. 결과 값 반환
        return answer;
    }
}