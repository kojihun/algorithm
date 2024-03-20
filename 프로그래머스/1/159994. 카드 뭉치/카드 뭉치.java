class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {        
        int cards1Index = 0;
        int cards2Index = 0;
        
        String answer = "Yes";
        for(int i = 0; i < goal.length; i++) {
            String word = goal[i];
            
            boolean isPossibleToMake = false;
            if(cards1Index < cards1.length && cards1[cards1Index].equals(word)) {
                cards1Index++;
                isPossibleToMake = true;
            }
            
            if(cards2Index < cards2.length && cards2[cards2Index].equals(word)) {
                cards2Index++;
                isPossibleToMake = true;
            }
            
            if(!isPossibleToMake) {
                answer = "No";
                break;
            }
        }
        
        return answer;
    }
}
