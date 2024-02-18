import java.util.*;

class Solution {
    public int[] solution(String msg) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            map.put(Character.toString((char) ('A' + i)), i + 1);
        }

        List<Integer> answer = new ArrayList<>();
        int index = 27;

        String currentWord = "";
        String[] input = msg.split("");
        for (int i = 0; i < input.length; i++) {
            String word = currentWord + input[i];
            if (map.containsKey(word)) {
                currentWord = word;
            } else {
                answer.add(map.get(currentWord));
                map.put(word, index++);
                currentWord = input[i];
            }
        }
        answer.add(map.get(currentWord));

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
