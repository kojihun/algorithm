class Solution {
    public boolean solution(String s) {
        boolean answer = true;        
        char[] array = s.toCharArray();
        int num = s.length();
        
        if(num == 4  || num == 6){
            answer = true;
        }else{
            answer = false;
        }
        
        for(int i = 0; i < array.length; i++){
            if(Character.getNumericValue(array[i]) > 9){
                answer = false;
            }
        }
        
        return answer;
    }
}