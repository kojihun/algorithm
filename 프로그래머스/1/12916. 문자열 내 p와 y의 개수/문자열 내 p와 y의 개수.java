class Solution {
    boolean solution(String s) {
        s = s.toUpperCase(); // 문자열을 모두 대문자로 변환
        int pCount = 0;
        int yCount = 0;
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == 'P') {
                pCount++;
            } else if(c == 'Y') {
                yCount++;
            }
        }

        return pCount == yCount;
    }
}