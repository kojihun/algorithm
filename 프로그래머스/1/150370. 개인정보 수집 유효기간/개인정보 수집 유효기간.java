import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> expiredPrivacies = new ArrayList<>();
        String[] todayParts = today.split("\\.");
        int currentYear = Integer.parseInt(todayParts[0]);
        int currentMonth = Integer.parseInt(todayParts[1]);
        int currentDay = Integer.parseInt(todayParts[2]);
        
        Map<String, Integer> termsMap = parseTerms(terms);

        for (int i = 0; i < privacies.length; i++) {
            String[] privacyParts = privacies[i].split(" ");
            String[] dateParts = privacyParts[0].split("\\.");
            int year = Integer.parseInt(dateParts[0]);
            int month = Integer.parseInt(dateParts[1]);
            int day = Integer.parseInt(dateParts[2]);
            
            int term = termsMap.get(privacyParts[1]);
            int[] updatedDate = updateDate(year, month, day, term);
            year = updatedDate[0];
            month = updatedDate[1];
            day = updatedDate[2];
            
            if (year < currentYear || 
                (year == currentYear && (month < currentMonth || (month == currentMonth && day < currentDay)))) {
                expiredPrivacies.add(i + 1);
            }
        }

        return expiredPrivacies.stream().mapToInt(Integer::intValue).toArray();
    }

    private Map<String, Integer> parseTerms(String[] terms) {
        Map<String, Integer> termsMap = new HashMap<>();
        for (String term : terms) {
            String[] parts = term.split(" ");
            termsMap.put(parts[0], Integer.parseInt(parts[1]));
        }
        return termsMap;
    }

    private int[] updateDate(int year, int month, int day, int term) {
        month += term;
        if (month > 12) {
            year += (month - 1) / 12;
            month = (month - 1) % 12 + 1;
        }
        
        if (day == 1) {
            month--;
            day = 28;
        } else {
            day--;
        }
        
        return new int[]{year, month, day};
    }
}
