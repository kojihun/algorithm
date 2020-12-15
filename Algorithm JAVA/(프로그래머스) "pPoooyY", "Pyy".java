class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char[] list = new char[s.length()];
        int pcount = 0;
        int ycount = 0;
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        s = s.toUpperCase();
        
        for(int i = 0; i < list.length; i++){
            list[i] = s.charAt(i);
            if(list[i] == 'P'){
                pcount++;
            }else if(list[i] == 'Y'){
                ycount++;
            }
        }
        
        if(pcount == ycount){
            answer = true;
        }else{
            answer = false;
        }
        
        return answer;
    }
}
