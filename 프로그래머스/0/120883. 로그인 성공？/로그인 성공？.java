import java.util.*;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        
        Map<String, String> map = new HashMap<>();
        for(int i = 0; i < db.length; i++) {
            String key = db[i][0];
            String value = db[i][1];
            
            map.put(key, value);
        }
        
        String id = id_pw[0];
        String pw = id_pw[1];
        
        if(map.containsKey(id)) {
            String value = map.get(id);
            if(pw.equals(value)) {
                answer = "login";
            }else {
                answer = "wrong pw";
            }
        }else {
            answer = "fail";
        }
        
        
        return answer;
    }
}