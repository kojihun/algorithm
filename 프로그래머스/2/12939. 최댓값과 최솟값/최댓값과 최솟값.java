class Solution {
    public String solution(String s) {
        // 1. 문자열을 공백 기준으로 배열에 담는다.
        String[] input = s.split(" ");
        
        // 2. 최댓값과 최솟값을 저장할 변수를 선언한다.
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        
        // 3. 반복문을 순회하며, 최댓값과 최솟값을 찾는다.
        for(int i = 0; i < input.length; i++) {
            int curNumber = Integer.parseInt(input[i]);
            if(maxValue < curNumber) {
                maxValue = curNumber;
            }
            
            if(minValue > curNumber) {
                minValue = curNumber;
            }
        }
        
        // 4. 공백을 기준으로 최솟값과 최댓값을 나란히 리턴한다.
        return minValue + " " + maxValue;
    }
}