class Solution {
    public String solution(String[] seoul) {
        int position = 0;
        
        for(int i = 0; i < seoul.length; i++){
            if(seoul[i].equals("Kim")){
                position = i;
            }
        }
        
        String answer = "김서방은 " + String.valueOf(position) + "에 있다";
        return answer;
    }
}
