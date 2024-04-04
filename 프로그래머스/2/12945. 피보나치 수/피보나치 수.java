class Solution {
    public int solution(int n) {
        int[] array = new int[n + 1];
        array[0] = 0;
        array[1] = 1;
        
        for(int i = 2; i <= n; i++) {
            array[i] = (array[i - 2] + array[i - 1]) % 1234567;
        }
        
        return array[n]; 
    }
}