import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String s = String.valueOf(n);
        String[] input = s.split("");
        
        Arrays.sort(input, (s1, s2) -> Integer.compare(Integer.parseInt(s2), Integer.parseInt(s1)));
        
        StringBuilder sb = new StringBuilder();
        for(String digit : input) {
            sb.append(digit);
        }

        return Long.parseLong(sb.toString());
    }
}
