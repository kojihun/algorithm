import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) {
            return cities.length * 5;
        }

        LinkedList<String> cache = new LinkedList<>();
        int answer = 0;

        for (String city : cities) {
            String lowerCaseCity = city.toLowerCase();
            if (cache.contains(lowerCaseCity)) {
                answer += 1;
                cache.remove(lowerCaseCity);
            } else {
                answer += 5;
                if (cache.size() >= cacheSize) {
                    cache.removeFirst();
                }
            }
            cache.addLast(lowerCaseCity);
        }

        return answer;
    }
}