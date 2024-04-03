class Solution {
    public int solution(int n) {
        int oneCount = countOnes(n);
        for (int i = n + 1; ; i++) {
            if (countOnes(i) == oneCount) {
                return i;
            }
        }
    }
    
    private int countOnes(int num) {
        int count = 0;
        String binaryString = Integer.toBinaryString(num);
        
        for (char c : binaryString.toCharArray()) {
            if (c == '1') {
                count++;
            }
        }
        
        return count;
    }
}