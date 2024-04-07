import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) {
            return cities.length * 5;
        }

        LinkedHashMap<String, Integer> cache = new LinkedHashMap<>(cacheSize, 0.75f, true);
        int answer = 0;

        for (String city : cities) {
            String lowerCaseCity = city.toLowerCase();
            if (cache.containsKey(lowerCaseCity)) {
                answer += 1;
            } else {
                answer += 5;
                if (cache.size() >= cacheSize) {
                    Iterator<Map.Entry<String, Integer>> iterator = cache.entrySet().iterator();
                    iterator.next();
                    iterator.remove();
                }
            }
            cache.put(lowerCaseCity, 0);
        }

        return answer;
    }
}