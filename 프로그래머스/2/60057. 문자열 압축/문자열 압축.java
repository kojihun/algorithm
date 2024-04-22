class Solution {
    public int solution(String s) {
        int answer = s.length();
        int count = 1;
        
        for(int i = 1; i <= s.length() / 2; i++) {
            StringBuilder sb = new StringBuilder();
            String baseWord = s.substring(0, i);
            
            for(int j = i; j <= s.length(); j += i) {
                int index = Math.min(j + i, s.length());
                String compareWord = s.substring(j, index);
                
                if(baseWord.equals(compareWord)) {
                    count++;
                }else {
                    if(count >= 2) {
                        sb.append(count);
                    }
                    sb.append(baseWord);
                    baseWord = compareWord;
                    count = 1;
                }
            }
            sb.append(baseWord);
            answer = Math.min(answer, sb.length());
        }
        return answer;
    }
}