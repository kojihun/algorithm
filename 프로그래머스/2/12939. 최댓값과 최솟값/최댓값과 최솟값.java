class Solution {
    public String solution(String s) {
        // 1. 문자열을 공백 기준으로 나눈다.
        String[] input = s.split(" ");
        
        // 2. 최댓값과 최솟값을 저장할 변수를 선언한다.
        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;
        
        // 3. 반복문을 순회하며 최솟값과 최댓값을 찾는다.
        for(String number : input) {
            int convertNumber = Integer.parseInt(number);
            
            if(convertNumber < minNumber) {
                minNumber = convertNumber;
            }
            
            if(convertNumber > maxNumber) {
                maxNumber = convertNumber;
            }
        }
        
        // 4. 두 개의 문자열을 더 하고 리턴
        return minNumber + " " + maxNumber;        
    }
}