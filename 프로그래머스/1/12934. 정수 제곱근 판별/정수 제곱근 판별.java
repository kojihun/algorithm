class Solution {
    public long solution(long n) {
        if(Math.pow(Math.sqrt(n) + 1, 2) % 1 == 0) {
            return (long) Math.pow(Math.sqrt(n) + 1, 2);
        }
        return -1;
    }
}