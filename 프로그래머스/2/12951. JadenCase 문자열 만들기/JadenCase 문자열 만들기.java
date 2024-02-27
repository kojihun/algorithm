class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        
        // 1. 문자열을 문자 단위로 쪼갠다.
        char[] input = s.toCharArray();
        
        // 2. 반복문을 순회하며 공백 다음의 문자는 대문자로 그 외 문자는 소문자로 변환한다.
        boolean isFirst = true;
        for(char c : input) {
            // 3. 해당 문자가 공백인지 확인
            if(Character.isWhitespace(c)) {
                isFirst = true;
                answer.append(c);
            }else {
                // 4. 공백 이후 첫 문자일 경우
                if(isFirst) {
                    answer.append(Character.toUpperCase(c));
                    isFirst = false;
                }
                // 5. 그 외에는 모두 소문자 처리
                else {
                    answer.append(Character.toLowerCase(c));
                }
            }
        }
        
        // 6. 결과 값 반환
        return answer.toString();
    }
}