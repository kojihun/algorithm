class Solution {
    public boolean solution(int x) {
        String s = String.valueOf(x);
        String[] digits = s.split("");
        
        int sum = 0;
        for(String digit : digits) {
            sum += Integer.parseInt(digit);
        }
        
        return x % sum == 0;
    }
}