import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(int n, String[] words) {
        // 1. 단어와 말한 횟수를 저장하기 위해 Map 선언
        Map<String, Integer> map = new HashMap<>();
        int[] answer = new int[2];
        
        // 2. 최초 단어 추가
        String word = words[0];
        map.put(word, map.getOrDefault(word, 0) + 1);
        
        // 3. 배열을 순회한다.
        int round = 1;
        for(int i = 1; i < words.length; i++) {
            // 라운드 증가
            if(i % n == 0) {
                round++;
            }
            
            // 4. map에 현재 단어가 몇번 나왔는지 저장한다.
            String beforeWord = words[i - 1];
            String lastAlphabet = beforeWord.substring(beforeWord.length() - 1);
            
            word = words[i];
            String firstAlphabet = word.substring(0, 1);
            
            // 5. 끝말잇기가 되는지 먼저 확인
            if(!lastAlphabet.equals(firstAlphabet)) {
                answer[0] = (i + 1) % n == 0 ? n : (i + 1) % n;
                answer[1] = round;
                break;
            }
            
            // 6. 개수 추가
            map.put(word, map.getOrDefault(word, 0) + 1);
            
            // 7. 2개 이상일 경우 값 세팅
            if(map.get(word) > 1) {
                answer[0] = (i + 1) % n == 0 ? n : (i + 1) % n;
                answer[1] = round;
                break;
            }
        }
        return answer;
    }
}